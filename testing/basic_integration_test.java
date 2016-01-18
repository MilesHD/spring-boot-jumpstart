/* 
 * Integration Test example. This is testing an application where "AddressBookConfiguration"
 * is the application context and we are verifiying a service we inject in properly executes
 * each of its methods
 */

// Instructs that the class should use Spring's JUnit facilities 
@RunWith(SpringJUnit4ClassRunner.class)
// Loads application context "AddressBookConfiguration"
@ContextConfiguration(classes=AddressBookConfiguration.class)
public class AddressServiceTests {
    //Loads application context and injects address service
    @Autowired
    private AddressService addressService;

    @Test
    public void testService() {
        Address address = addressService.findByLastName("Sheman");
        assertEquals("P", address.getFirstName());
        assertEquals("Sherman", address.getLastName());
        assertEquals("42 Wallaby Way", address.getAddressLine1());
        assertEquals("Sydney", address.getCity());
        assertEquals("New South Wales", address.getState());
        assertEquals("2000", address.getPostCode());
    }
}
