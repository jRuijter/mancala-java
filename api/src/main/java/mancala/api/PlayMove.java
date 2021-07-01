package mancala.api;

import java.io.IOException;
import jakarta.servlet.http.*;
import jakarta.validation.OverridesAttribute.List;
import jakarta.servlet.ServletException;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;

import mancala.api.models.*;
import mancala.domain.MancalaException;
import mancala.domain.MancalaImpl;

@Path("/PlayMove")
public class PlayMove{
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response playMove(@Context HttpServletRequest request, PitInput pitSelected) throws MancalaException{
			
			HttpSession session = request.getSession(true);
			Integer pitIndex = pitSelected.getPitToPlay();

			MancalaImpl currentGame = (MancalaImpl)session.getAttribute("mancala");
			String namePlayer1 = (String)session.getAttribute("player1");
			String namePlayer2 = (String)session.getAttribute("player2");
			//Mancala currentGameAPI = new Mancala(currentGame, namePlayer1, namePlayer2);
			//Player[] players = currentGameAPI.getPlayers();

			currentGame.playPit(pitIndex);
			//System.out.println(pitIndex);
			
			session.setAttribute("mancala", currentGame);
			Mancala currentGameAPI = new Mancala(currentGame, namePlayer1, namePlayer2);
			Mancala output = currentGameAPI;
			return Response.status(200).entity(output).build();
		}
}	