package iuh.ktpm.StepCreateCard;

import iuh.ktpm.models.Card;

public class CheckExpiredDate implements iuh.ktpm.Step<Card, Card>{
    @Override
    public Card execute(Card input) {
        //expired date: 12/22
        if (input.getExpiredDate().length() != 5) {
            throw new IllegalArgumentException("Expired date must have 5 characters");
        }

        String[] expiredDate = input.getExpiredDate().split("/");
        if (expiredDate.length != 2) {
            throw new IllegalArgumentException("Expired date must have 2 parts");
        }

        if (expiredDate[0].length() != 2 || expiredDate[1].length() != 2) {
            throw new IllegalArgumentException("Expired date must have 2 characters for each part");
        }

        if (Integer.parseInt(expiredDate[0]) < 1 || Integer.parseInt(expiredDate[0]) > 12) {
            throw new IllegalArgumentException("Month must be between 1 and 12");
        }

        if (Integer.parseInt(expiredDate[1]) < 0 || Integer.parseInt(expiredDate[1]) > 99) {
            throw new IllegalArgumentException("Year must be between 0 and 99");
        }

        return input;
    }

    @Override
    public <R> iuh.ktpm.Step<Card, R> then(iuh.ktpm.Step<Card, R> source) {
        return iuh.ktpm.Step.super.then(source);
    }
}
