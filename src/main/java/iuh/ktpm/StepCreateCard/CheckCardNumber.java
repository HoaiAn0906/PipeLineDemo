package iuh.ktpm.StepCreateCard;

import iuh.ktpm.Step;
import iuh.ktpm.models.Card;

public class CheckCardNumber implements Step<Card, Card>{
    @Override
    public Card execute(Card input) {
        if (input.getCardNumber().length() != 12) {
            throw new IllegalArgumentException("CCCD must have 12 characters");
        }

        return input;
    }

    @Override
    public <R> Step<Card, R> then(Step<Card, R> source) {
        return Step.super.then(source);
    }
}
