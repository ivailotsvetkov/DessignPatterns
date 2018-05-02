package Observer;

class TestObserver
{

   public static void main(String argv[])
   {

      ClassBeingObserved subject = new ClassBeingObserved();

      new Class1Observing("Observer A", subject);
      new Class1Observing("Observer B", subject);
      new Class1Observing("Observer C", subject);

      subject.setValue(5);
      subject.setValue(9);
   }
}