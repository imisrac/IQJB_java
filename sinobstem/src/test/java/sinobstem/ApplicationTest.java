package sinobstem;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ApplicationTest {

    private Application application = Application.getApplicationInstance();

    @Test
    public void getApplicationInstance() {
        Application anotherApplication = Application.getApplicationInstance();
        Assert.assertEquals(anotherApplication, application);
    }

    @Test
    public void info() {
        application.info();
        assertThat(application.getState(), is("my info"));
    }

    @Test
    public void error() {
        application.error();
        assertThat(application.getState(), is("my error"));
    }
}