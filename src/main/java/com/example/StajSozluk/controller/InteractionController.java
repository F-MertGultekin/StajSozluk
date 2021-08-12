package com.example.StajSozluk.controller;


import com.example.StajSozluk.Model.Interaction;
import com.example.StajSozluk.dto.InteractionDto;
import com.example.StajSozluk.services.IInteractionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/interaction")
public class InteractionController
{
    @Autowired
    private IInteractionService interactionService;

    @PostMapping("/addInteraction")
    public void addInteraction(@RequestBody InteractionDto interactionDto)
    {
        //exceptionCheck(interactionDto);
        interactionService.addInteraction(interactionDto);
    }
    @DeleteMapping("/{interactionId}/deleteInteraction")
    public void deleteInteraction(@PathVariable int interactionId)
    {
        interactionService.deleteInteraction(interactionId);

    }
    @PutMapping("/updateInteraction")
    public void updateInteraction(@RequestBody InteractionDto interactionDto)
    {
        //exceptionCheck(interactionDto);
        interactionService.updateInteraction(interactionDto);
    }
    @GetMapping("/{userId}/getAllInteractionsOfUser")
    public List<Interaction> getAllInteractionsOfUser(@PathVariable int userId)
    {
        return interactionService.getAllInteractionsOfUser(userId);
    }
    @GetMapping("/{entryId}/getAllInteractionsOfEntry")
    public List<Interaction> getAllInteractionsOfEntry(@PathVariable int entryId)
    {
        return interactionService.getAllInteractionsOfEntry(entryId);
    }
    @GetMapping("/{interactionId}/getInteraction")
    public Interaction getInteraction( @PathVariable int interactionId)
    {
        return interactionService.getInteraction(interactionId);
    }


}
