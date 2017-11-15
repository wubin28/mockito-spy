package com.wubinben.katas;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

public class ClientTest {

    @Test
    public void should_return_EFG_given_a_spied_webservice() throws Exception {
        Client client = new Client();
        RestService spiedWebService = spy(new RestService());
        when(spiedWebService.callWebService()).thenReturn("EFG");
        RestService.setInstance(spiedWebService);

        assertEquals("EFG", client.foo());
    }
}
