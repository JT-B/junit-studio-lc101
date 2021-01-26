package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {


    @Test
    public void onlyBracketsReturnsTrue() { assertTrue(BalancedBrackets.hasBalancedBrackets("[]")); }
    @Test
    public void bracketsAroundWordReturnsTrue() { assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]")); }
    @Test
    public void singleBracketReturnsFalse() { assertFalse(BalancedBrackets.hasBalancedBrackets("[Shoes")); }
    @Test
    public void curlyBracketsIgnored() { assertTrue(BalancedBrackets.hasBalancedBrackets("[{]")); }
    @Test
    public void noBracketsReturnTrue() { assertTrue(BalancedBrackets.hasBalancedBrackets("Spaceship")); }
    @Test
    public void bracketsFacingOutReturnFalse() { assertFalse(BalancedBrackets.hasBalancedBrackets("[]]["));}
    @Test
    public void tooManyCloseBracketsReturnFalse() { assertFalse(BalancedBrackets.hasBalancedBrackets("[[]]]"));}
    @Test
    public void tooManyOpenBracketsReturnFalse() { assertFalse(BalancedBrackets.hasBalancedBrackets("[[[]]"));}
    @Test
    public void charAroundBracketsDoNotPreventTrue() { assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Cod]e"));}
    @Test
    public void charAroundBracketsDoNotPreventFalse() { assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Cod[e"));}
}
