Try catch, które pojawiły się w moich poprzednich programach;
Przy sprawdzaniu czy istnieje taki element tablicy użyłem if else, ponieważ try catch nie zadziałało;
Zadanie 4 - wywoływanie metod klasy B przez metodę klasy A jest przykładem kompozycji i jest potwierdzeniem idei hermetyzacji.
class A {
B b = new B();
rent() {
B.rent();
}
Dzięki temu klasa Main mogła korzystać z metod klasy RentalRules, ale tylko za pośrednictwem klasy ItemInfo.
Przez taką kompozycje metoda rent() od razu "wiedziała" na jakim obiekcie działa (konkretny przedmiot z bilbioteki).
Dziedziczenia użyłem przy konkretnych przedmiotach z biliboteki: Audiobook, Book itp.