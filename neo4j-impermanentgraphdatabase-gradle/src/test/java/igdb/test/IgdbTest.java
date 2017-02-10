package igdb.test;

import org.junit.Test;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Transaction;
import org.neo4j.test.TestGraphDatabaseFactory;

public class IgdbTest {

  @Test
  public void test1() throws Exception {
    GraphDatabaseService gds = new TestGraphDatabaseFactory().newImpermanentDatabase();
    Transaction tx = gds.beginTx();
    gds.execute("MATCH (n) RETURN n");
  }

}
