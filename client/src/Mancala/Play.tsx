import React, { useState } from "react";
import type { GameState } from "../gameState";
import "./Play.css";
import { StartGame } from "./StartGame";

type PlayProps = {
    gameState: GameState;
    setGameState(newGameState: GameState): void;
}

export function Play({ gameState, setGameState }: PlayProps) {

    const [pitSelected, setPitSelected] = useState("");

    async function tryPlay(e: React.FormEvent, pitID: number){
        try {
            const response = await fetch('mancala/api/PlayMove', {
                method: 'POST',
                headers: {
                    'Accept': 'application/json',
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify({ pitToPlay: pitID })
            });

            if (response.ok) {
                const gameState = await response.json();
                setGameState(gameState);
            } else {
                console.error(response.statusText);
            }

        } catch (error) {
            console.error(error.toString());
        }
    }
    
    return (
        <div className="board" id="board">
            <p className="players">{gameState.players[0].name} vs {gameState.players[1].name}</p>
            
            <button className="pit" id="12" onClick={(e) => {tryPlay(e, 12);}}> 
                {gameState.players[1].pits[5].nrOfStones}</button>
            <button className="pit" id="11" onClick={(e) => {tryPlay(e, 11);}}>
                {gameState.players[1].pits[4].nrOfStones }</button>
            <button className="pit" id="10" onClick={(e) => {tryPlay(e, 10);}}>
                {gameState.players[1].pits[3].nrOfStones}</button>
            <button className="pit" id="9" onClick={(e) => {tryPlay(e, 9);}}>
                {gameState.players[1].pits[2].nrOfStones}</button>
            <button className="pit" id="8" onClick={(e) => {tryPlay(e, 8);}}>
                {gameState.players[1].pits[1].nrOfStones}</button>
            <button className="pit" id="7" onClick={(e) => {tryPlay(e, 7);}}>
                {gameState.players[1].pits[0].nrOfStones}</button>

            <p></p> 
                    <button className="kalaha1">{gameState.players[1].pits[6].nrOfStones}</button> 
                    <button className="kalaha2">{gameState.players[0].pits[6].nrOfStones}</button> 
            <p></p>

            <button className="pit" id="0" onClick={(e) => {tryPlay(e, 0);}}>
                {gameState.players[0].pits[0].nrOfStones}</button> 
            <button className="pit" id="1" onClick={(e) => {tryPlay(e, 1);}}>
                {gameState.players[0].pits[1].nrOfStones}</button>
            <button className="pit" id="2" onClick={(e) => {tryPlay(e, 2);}}>
                {gameState.players[0].pits[2].nrOfStones}</button>
            <button className="pit" id="3" onClick={(e) => {tryPlay(e, 3);}}>
                {gameState.players[0].pits[3].nrOfStones}</button>
            <button className="pit" id="4" onClick={(e) => {tryPlay(e, 4);}}>
                {gameState.players[0].pits[4].nrOfStones}</button>
            <button className="pit" id="5" onClick={(e) => {tryPlay(e, 5);}}>
                {gameState.players[0].pits[5].nrOfStones}</button>
        </div>

    )
    
  //  function playBowl({ gameState, setGameState }: PlayProps){
  //      gameState.players[1].pits[5].nrOfStones++;
  //  }

/*
    function playBowl({ gameState }: PlayProps){

        function pitClicked() {  
        }
        const [playerOne, setPlayerOne] = useState("");
        const [playerTwo, setPlayerTwo] = useState("");
    }


    let pitList = document.querySelectorAll(".pit");
    for (let i = 0; i < pitList.length; i++) {
    pitList[i].addEventListener("click", playBowl);
    }

    function printBoard({ gameState }: PlayProps){
        return (
            <button className="pit">
                {gameState.players[0].pits[0].nrOfStones}
            </button>
        )   
    }
    */

}

