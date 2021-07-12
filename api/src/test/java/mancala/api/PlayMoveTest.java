package mancala.api;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import jakarta.servlet.http.*;
import jakarta.ws.rs.core.*;

import mancala.api.models.*;
import mancala.domain.MancalaImpl;

public class PlayMoveTest {
    @Test
    public void startingMancalaShouldBeAllowed() {

        HttpServletRequest request = createRequestContext();
        var response = startMancala("Mario", "Luigi");
        MancalaImpl currentGame = (MancalaImpl)session.getAttribute("mancala");
		String namePlayer1 = (String)session.getAttribute("player1");
		String namePlayer2 = (String)session.getAttribute("player2");
    
    }

    private Response startMancala(String namePlayer1, String namePlayer2) {
        var servlet = new StartMancala();
        var request = createRequestContext();
        var input = playerInput(namePlayer1, namePlayer2);
        return servlet.initialize(request, input);
    }

    private HttpServletRequest createRequestContext() {
        request = mock(HttpServletRequest.class);
        session = mock(HttpSession.class);
        when(request.getSession(true)).thenReturn(session);
        return request;
    }

    private HttpServletRequest request;
    private HttpSession session;

    private PlayerInput playerInput(String namePlayer1, String namePlayer2) {
        var input = new PlayerInput();
        input.setNameplayer1(namePlayer1);
        input.setNameplayer2(namePlayer2);
        return input;
    }
}