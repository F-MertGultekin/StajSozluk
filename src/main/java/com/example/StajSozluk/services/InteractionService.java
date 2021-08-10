package com.example.StajSozluk.services;

import com.example.StajSozluk.EnumFile.EntryType;
import com.example.StajSozluk.EnumFile.InteractionType;
import com.example.StajSozluk.Model.Entry;
import com.example.StajSozluk.Model.Interaction;
import com.example.StajSozluk.Model.Topic;
import com.example.StajSozluk.Model.User;
import com.example.StajSozluk.dto.InteractionDto;
import com.example.StajSozluk.repository.IEntryRepository;
import com.example.StajSozluk.repository.IInteractionRepository;
import com.example.StajSozluk.repository.ITopicRepository;
import com.example.StajSozluk.repository.IUserRepository;
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
    private IEntryRepository entryRepository;

    @Autowired
    private IUserRepository userRepository;

    @Override
    public void addInteraction(InteractionDto interactionDto)
    {

        User user = userRepository.getById(interactionDto.getUserId());
        Entry entry = entryRepository.findById(interactionDto.getEntryId());
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
