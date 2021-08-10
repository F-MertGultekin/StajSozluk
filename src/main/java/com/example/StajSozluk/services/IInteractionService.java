package com.example.StajSozluk.services;

import com.example.StajSozluk.Model.Interaction;
import com.example.StajSozluk.dto.InteractionDto;


import java.util.List;

public interface IInteractionService {


        void addInteraction(InteractionDto interactionDto);
        void deleteInteraction(int InteractionId);
        void updateInteraction(InteractionDto interactionDto);
        List<Interaction> getAllInteractionsOfEntry(int entryId);
        List<Interaction> getAllInteractionsOfUser(int userId);
        Interaction getInteraction(int InteractionId);

}
