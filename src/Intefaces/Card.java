package Intefaces;

public sealed interface Card permits DebitCard, CreditCard {
}



//final keyword is used in these classes because they depend entirely on the sealed interface thus should not be inherited
non-sealed class DebitCard implements Card{  
}
//you can as well seal these classes if they have subclasses that extend them
sealed class CreditCard implements Card permits VisaCreditCard{
}

/*final class AmazonCard implements Card{  cannot access the card interface
}*/

final class VisaCreditCard extends CreditCard{}

//we can also make the debit card to non sealed to be extended by the amazon card
// it lets the compiler know that we know the consequences

final class AmazonCard extends DebitCard{}



