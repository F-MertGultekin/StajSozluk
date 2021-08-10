package com.example.StajSozluk.EnumFile;

public enum InteractionType
{
    like(0),
    dontlike(1);

     int value;
     InteractionType(int value)
     {
             this.value=value;
     }
}
