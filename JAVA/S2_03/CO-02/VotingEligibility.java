// Custom exception for age not valid to vote
class AgeNotValidToVoteException extends Exception {
    public AgeNotValidToVoteException(String message) {
        super(message);
    }
}

// Class to check voting eligibility
public class VotingEligibility {
    // Method to check if age is valid to vote
    public static void checkVotingEligibility(int age) throws AgeNotValidToVoteException {
        if (age < 18) {
            throw new AgeNotValidToVoteException("Age is not valid to vote");
        } else {
            System.out.println("You are eligible to vote");
        }
    }

    // Main method to test voting eligibility
    public static void main(String[] args) throws AgeNotValidToVoteException {
        checkVotingEligibility(20); // Test with eligible age
        checkVotingEligibility(15); // Test with ineligible age (will throw exception)
    }
}
