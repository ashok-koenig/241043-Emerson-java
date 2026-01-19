import java.util.function.Predicate;

public class PredicateDemo {
    static void main() {
        Predicate<Integer> checkVotingEligibility = (age) -> age>18;
        System.out.println(checkVotingEligibility.test(25));
        System.out.println(checkVotingEligibility.test(15));
    }
}
