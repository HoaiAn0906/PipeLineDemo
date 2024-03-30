package iuh.ktpm.StepCreateCard;

import iuh.ktpm.Step;
import iuh.ktpm.models.Card;

public class SaveDatabase implements Step<Card, Card>{
    @Override
    public Card execute(Card input) {
        //Logic to save data to database

        System.out.println("Save data to database");
        return input;
    }

    @Override
    public <R> Step<Card, R> then(Step<Card, R> source) {
        return Step.super.then(source);
    }
}
