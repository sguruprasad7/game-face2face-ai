package de.upb.mlseminar.mymcts.montecarlo;

import java.util.Collections;
import java.util.Comparator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.upb.mlseminar.mymcts.tree.MCTSNode;;

/**
 * This class calculates the UCT (Upper Confidence Bound for Trees) values, 
 * and returns the best node with maximum UCT value
 *
 * @author Guru Prasad Savandaiah
 * Reference : https://github.com/eugenp/tutorials/blob/master/algorithms-searching/src/main/java/com/baeldung/algorithms/mcts/montecarlo/UCT.java
 *
 */

public class UCT {

	private static final Logger logger = LoggerFactory.getLogger(UCT.class);
    public static double uctValue(int totalVisit, double nodeWinScore, int nodeVisit) {
    	
    	double uctValue;
        if (nodeVisit == 0) {
            uctValue = Integer.MAX_VALUE;
            return uctValue;
        }
        uctValue = (nodeWinScore / (double) nodeVisit) + 1.41 * Math.sqrt(Math.log(totalVisit) / (double) nodeVisit);
        return uctValue;
    }

    public static  MCTSNode findBestNodeWithUCT(MCTSNode node) {
        int parentVisit = node.getState().getVisitCount();
        return Collections.max(
          node.getChildArray(),
          Comparator.comparing(c -> uctValue(parentVisit, c.getState().getWinScore(), c.getState().getVisitCount())));
    }
}
