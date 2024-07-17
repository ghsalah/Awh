class AgeNotValidToVoteException extends Exception {
    public AgeNotValidToVoteException(String message) {
        super(message);
    }
}

public class VotingEligibility {
    public static void checkVotingEligibility(int age) throws AgeNotValidToVoteException {
        if (age < 18) {
            throw new AgeNotValidToVoteException("Age is not valid to vote");
        } else {
            System.out.println("You are eligible to vote");
        }
    }

    public static void main(String[] args) {
        try {
            int age = Integer.parseInt(args[0]);  // Getting age from command line arguments
            checkVotingEligibility(age);
        } catch (AgeNotValidToVoteException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid number for age");
        }
    }
}
