package testing;
import static org.junit.Assert.*;
import org.junit.Test;
import hotel.DP;
import hotel.IData;
import hotel.InHotel;
import junit.framework.Assert;

public class InHotelTest {
	protected DP dp=new DP();
	protected IData id=dp;
	protected InHotel ih=new InHotel(id);
	@Test
	public void testIn() {
		id.iniRooms();
		assertEquals("Marry成功入住901房间！",ih.in(901, "Marry"));
	}

}
