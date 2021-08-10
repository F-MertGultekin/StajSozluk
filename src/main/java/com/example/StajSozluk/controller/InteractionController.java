package com.example.StajSozluk.controller;


import com.example.StajSozluk.Model.Interaction;
import com.example.StajSozluk.dto.InteractionDto;
import com.example.StajSozluk.services.IInteractionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InteractionController
{
    @Autowired
    private IInteractionService interactionService;

    @PostMapping("/interaction/addInteraction")
    public void addInteraction(@RequestBody InteractionDto interactionDto)
    {
        //exceptionCheck(interactionDto);
        interactionService.addInteraction(interactionDto);
    }
    @DeleteMapping("/interaction/{interactionId}/deleteInteraction")
    public void deleteInteraction(@PathVariable int interactionId)
    {
        interactionService.deleteInteraction(interactionId);

    }
    @PutMapping("/interaction/updateInteraction")
    public void updateInteraction(@RequestBody InteractionDto interactionDto)
    {
        //exceptionCheck(interactionDto);
        interactionService.updateInteraction(interactionDto);
    }
    @GetMapping("/user/{userId}/Interaction/getAllInteractionsOfUser")
    public List<Interaction> getAllInteractionsOfUser(@PathVariable int userId)
    {
        return interactionService.getAllInteractionsOfUser(userId);
    }
    @GetMapping("/entry/{entryId}/Interaction/getAllInteractionsOfEntry")
    public List<Interaction> getAllInteractionsOfEntry(@PathVariable int entryId)
    {
        return interactionService.getAllInteractionsOfEntry(entryId);
    }
    @GetMapping("/interation/{interactionId}/getInteraction")
    public Interaction getInteraction( @PathVariable int interactionId)
    {
        return interactionService.getInteraction(interactionId);
    }


}
