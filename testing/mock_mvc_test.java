// Static imports to make MockMvc test code more readable
import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ReadingListApplication.class)
@WebAppConfiguration
public class MockMvcWebTests {
    // Inject WebApplicationContext and MockMvc beans
    @Autowired
    private WebApplicationContext webContext;
    private MockMvc mockMvc;

    // Run before any test methods, create MockMvc instance
    // using injected WebApplicationContext
    @Before
    public void setupMockMvc() {
        mockMvc = MockMvcBuilders
            .webAppContextSetup(webContext)
            .build();
    }

    // Executes a GET HTTP request on the readingList path
    // and ensures the controller properly handeled the request and
    // returned the appropirate response
    @Test
    public void homePage() throws Exception {
      mockMvc.perform(get("/readingList"))
          .andExpect(status().isOk())
          .andExpect(view().name("readingList"))
          .andExpect(model().attributeExists("books"))
          .andExpect(model().attribute("books", is(empty())));
    }
}
