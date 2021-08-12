import org.junit.Assert;
import org.junit.Test;

public class ContaTest {

  @Test
  public void depositoTest(){
    Conta conta = new Conta(50);
    conta.depositar(20);
    Assert.assertEquals(70, conta.getSaldo(), 0.01);
  }


}
