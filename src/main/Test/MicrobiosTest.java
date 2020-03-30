import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class MicrobiosTest {

private int life=500;
private Microbios micro=new Microbios("Boca",life);


@Test
    void getMicro() {
            }

@Test
    void testToString() {
            }

@Test
    void testGetMicro() {
            }

@Test
    void getVidas() {
            }

@Test
    void setVidas() {
            }

@Test
    void setMicro() {
            }

@Test
    void DVidas() {
            }

@Test
    void findeVida() {
            }

@Test
    void testToString1() {
            }

@Test
    void TestIrOrgano(){
            int vida=micro.getVidas();
            micro.getMicro();
            assertFalse(micro.getVidas()<0);}




@ParameterizedTest
@ValueSource(strings={"Boca","Higado","Estomago","Cerebro","Pulmones","Intestinos","Corazon"})
    void TestirLugar(String Lugares)
            {
            micro.setVidas(1);
            micro.getMicro();
            assertEquals(true,micro.getVidas()>=1);
            }

@RepeatedTest(5)
    void TestBajarVida(){
            micro.getMicro();
            assertTrue(micro.getVidas()>=1);
            }

            }