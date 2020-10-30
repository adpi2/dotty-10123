
import com.sksamuel.elastic4s.TcpClient
import com.sksamuel.elastic4s.ElasticDsl
import org.elasticsearch.cluster.health.ClusterHealthStatus

object Main {
  import ElasticDsl._

  def status1(client: TcpClient): ClusterHealthStatus = {
    val response = client.execute(clusterHealth()).await
    response.getStatus()
  }

  def status2(client: TcpClient): ClusterHealthStatus =
    client.execute(clusterHealth()).await.getStatus()
}
