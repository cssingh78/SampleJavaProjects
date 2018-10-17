package test.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
  TestCase.class,
  TestCase1.class
})

public class TestSuite1 {
  // the class remains empty,
  // used only as a holder for the above annotations
}