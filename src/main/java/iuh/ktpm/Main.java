package iuh.ktpm;

import iuh.ktpm.StepCreateCard.CheckCardNumber;
import iuh.ktpm.StepCreateCard.CheckCCCDWithDataCountry;
import iuh.ktpm.StepCreateCard.CheckExpiredDate;
import iuh.ktpm.StepCreateCard.SaveDatabase;
import iuh.ktpm.models.Card;

public class Main {
    public static void main(String[] args) {
        Step<Card, Card> step = Step.of(new CheckCardNumber())
                .then(new CheckExpiredDate())
                .then(new CheckCCCDWithDataCountry())
                .then(new SaveDatabase());

        Card card = new Card("Nguyen Van A", "123456789123", "12/22", "123");

        Card result = step.execute(card);

        System.out.println(result);
    }
}