package de.upb.mlseminar.utilities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import de.upb.isml.thegamef2f.engine.GameState;
import de.upb.isml.thegamef2f.engine.Placement;
import de.upb.isml.thegamef2f.engine.board.Card;

/**
 * This class creates a Intermediate Game State object,
 * which is used for holding the game state during the running of the game 
 *
 * @author Guru Prasad Savandaiah
 *  
 */
public class IntermediateGameState {

	private List<Card> currentHandCards = Collections.synchronizedList(new ArrayList<Card>());
	private List<Placement> listOfCardPlacements = Collections.synchronizedList(new ArrayList<Placement>());
	private Card currentTopCardOnOwnAscendingDiscardPile;
	private Card currentTopCardOnOwnDescendingDiscardPile;
	private Card currentTopCardOnOpponentAscendingDiscardPile;
	private Card currentTopCardOnOpponentDescendingDiscardPile;


	public IntermediateGameState() {
		super();
	}
	
	public IntermediateGameState(GameState gameState, List<Card> currentHandCards, List<Placement> listOfCardPlacements,
			Card currentTopCardOnOwnAscendingDiscardPile, Card currentTopCardOnOwnDescendingDiscardPile,
			Card currentTopCardOnOpponentAscendingDiscardPile, Card currentTopCardOnOpponentDescendingDiscardPile) {
		super();
		this.currentHandCards = currentHandCards;
		this.listOfCardPlacements = listOfCardPlacements;
		this.currentTopCardOnOwnAscendingDiscardPile = currentTopCardOnOwnAscendingDiscardPile;
		this.currentTopCardOnOwnDescendingDiscardPile = currentTopCardOnOwnDescendingDiscardPile;
		this.currentTopCardOnOpponentAscendingDiscardPile = currentTopCardOnOpponentAscendingDiscardPile;
		this.currentTopCardOnOpponentDescendingDiscardPile = currentTopCardOnOpponentDescendingDiscardPile;
	}

	public IntermediateGameState(GameState gameState, List<Card> currentHandCards,
			List<Placement> listOfCardPlacements) {
		super();
		this.currentHandCards = currentHandCards;
		this.listOfCardPlacements = listOfCardPlacements;
	}

	public IntermediateGameState(List<Placement> listOfCardPlacements, Card currentTopCardOnOwnAscedingDiscardPile,
			Card currentTopCardOnOwnDescendingDiscardPile) {
		super();
		this.listOfCardPlacements = listOfCardPlacements;
		this.currentTopCardOnOwnAscendingDiscardPile = currentTopCardOnOwnAscedingDiscardPile;
		this.currentTopCardOnOwnDescendingDiscardPile = currentTopCardOnOwnDescendingDiscardPile;
	}

	public List<Card> getCurrentHandCards() {
		return currentHandCards;
	}

	public void setCurrentHandCards(List<Card> currentHandCards) {
		this.currentHandCards = currentHandCards;
	}

	public List<Placement> getListOfCardPlacements() {
		return listOfCardPlacements;
	}

	public void setListOfCardPlacements(List<Placement> listOfCardPlacements) {
		this.listOfCardPlacements = listOfCardPlacements;
	}

	public Card getCurrentTopCardOnOwnAscendingDiscardPile() {
		return currentTopCardOnOwnAscendingDiscardPile;
	}

	public void setCurrentTopCardOnOwnAscendingDiscardPile(Card currentTopCardOnOwnAscedingDiscardPile) {
		this.currentTopCardOnOwnAscendingDiscardPile = currentTopCardOnOwnAscedingDiscardPile;
	}

	public Card getCurrentTopCardOnOwnDescendingDiscardPile() {
		return currentTopCardOnOwnDescendingDiscardPile;
	}

	public void setCurrentTopCardOnOwnDescendingDiscardPile(Card currentTopCardOnOwnDescendingDiscardPile) {
		this.currentTopCardOnOwnDescendingDiscardPile = currentTopCardOnOwnDescendingDiscardPile;
	}

	public Card getCurrentTopCardOnOpponentAscendingDiscardPile() {
		return currentTopCardOnOpponentAscendingDiscardPile;
	}

	public void setCurrentTopCardOnOpponentAscendingDiscardPile(Card currentTopCardOnOpponentAscendingDiscardPile) {
		this.currentTopCardOnOpponentAscendingDiscardPile = currentTopCardOnOpponentAscendingDiscardPile;
	}

	public Card getCurrentTopCardOnOpponentDescendingDiscardPile() {
		return currentTopCardOnOpponentDescendingDiscardPile;
	}

	public void setCurrentTopCardOnOpponentDescendingDiscardPile(Card currentTopCardOnOpponentDescendingDiscardPile) {
		this.currentTopCardOnOpponentDescendingDiscardPile = currentTopCardOnOpponentDescendingDiscardPile;
	}

	@Override
	public String toString() {
		return "IntermediateGameState [currentHandCards=" + currentHandCards + ", currentTopCardOnOwnAscendingDiscardPile="
				+ currentTopCardOnOwnAscendingDiscardPile + ", currentTopCardOnOwnDescendingDiscardPile="
				+ currentTopCardOnOwnDescendingDiscardPile + ", currentTopCardOnOpponentAscendingDiscardPile="
				+ currentTopCardOnOpponentAscendingDiscardPile + ", currentTopCardOnOpponentDescendingDiscardPile="
				+ currentTopCardOnOpponentDescendingDiscardPile + ", listOfCardPlacements="
						+ listOfCardPlacements + "]";
	}

}
