package iuh.ktpm.StepCreateCard;

import iuh.ktpm.Step;
import iuh.ktpm.models.Card;

public class CheckCCCDWithDataCountry implements Step<Card, Card> {
    @Override
    public Card execute(Card input) {
        //Logic to check CCCD with data country

        return input;
    }

    @Override
    public <R> Step<Card, R> then(Step<Card, R> source) {
        return Step.super.then(source);
    }
}
