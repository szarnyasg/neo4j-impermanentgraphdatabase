package igdb.test;

import org.junit.Test;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.test.TestGraphDatabaseFactory;

public class IgdbTest {

  @Test
  public void test1() throws Exception {
    final GraphDatabaseService gds = new TestGraphDatabaseFactory().newImpermanentDatabase();
  }

}
