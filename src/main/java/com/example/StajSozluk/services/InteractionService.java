package com.example.StajSozluk.services;

import com.example.StajSozluk.EnumFile.InteractionType;
import com.example.StajSozluk.Model.Entry;
import com.example.StajSozluk.Model.Interaction;
import com.example.StajSozluk.Model.User;
import com.example.StajSozluk.dto.InteractionDto;
import com.example.StajSozluk.repository.IInteractionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Service
public class InteractionService implements IInteractionService
{

    @Autowired
     IInteractionRepository interactionRepository;

    @Autowired
    private IEntryService entryService;

    @Autowired
    private IUserService userService;

    @Override
    public void addInteraction(InteractionDto interactionDto)
    {
        User user = userService.getUser(interactionDto.getUserId());
        Entry entry = entryService.getEntry(interactionDto.getEntryId());
        Interaction newInteraction = new Interaction(interactionDto.isFavourite(), InteractionType.values()[interactionDto.getInteractionType()],user,entry);
        interactionRepository.save(newInteraction);

    }

    @Override
    public void deleteInteraction(int interactionId) {
        interactionRepository.deleteById(interactionId);

    }

    @Override
    public void updateInteraction(InteractionDto interactionDto) {
        Interaction interaction = interactionRepository.findById(interactionDto.getId());

        interaction.setInteractionType(InteractionType.values()[interactionDto.getInteractionType()]);
        interaction.setFavourite(interaction.isFavourite());
        interactionRepository.save(interaction);

    }

    @Override
    public List<Interaction> getAllInteractionsOfEntry(int entryId)
    {
        List<Interaction> AllInteractionsOfEntry=new ArrayList<>();
        interactionRepository.findAllByEntryId(entryId)
                .forEach(AllInteractionsOfEntry::add);
        return AllInteractionsOfEntry;
    }

    @Override
    public List<Interaction> getAllInteractionsOfUser(int userId)
    {
        List<Interaction> AllInteractionsOfUser=new ArrayList<>();
        interactionRepository.findAllByUserId(userId)
                .forEach(AllInteractionsOfUser::add);
        return AllInteractionsOfUser;
    }

    @Override
    public Interaction getInteraction(int interactionId) {

        return interactionRepository.findById(interactionId);
    }
}
