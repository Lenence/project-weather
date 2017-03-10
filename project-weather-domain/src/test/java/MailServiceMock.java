import static org.junit.Assert.assertFalse;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import fr.lenence.projectweather.services.mail.MailServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class MailServiceMock {
    // System under test
    @InjectMocks
    @Spy
    private final MailServiceImpl mailService = new MailServiceImpl();

    @Test
    public void sendMail() {
assertFalse(true);
    }
}
