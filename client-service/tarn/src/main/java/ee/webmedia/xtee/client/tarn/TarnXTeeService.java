package ee.webmedia.xtee.client.tarn;

import ee.webmedia.xtee.client.exception.XTeeServiceConsumptionException;
import ee.webmedia.xtee.client.tarn.types.ee.riik.xtee.tarn.producers.producer.tarn.TaitemenetluseMuutmineTaSisend;
import ee.webmedia.xtee.client.tarn.types.ee.riik.xtee.tarn.producers.producer.tarn.TaitemenetluseMuutmineTaVastus;
import ee.webmedia.xtee.client.tarn.types.ee.riik.xtee.tarn.producers.producer.tarn.TaitmisavalduseEsitamineParing;
import ee.webmedia.xtee.client.tarn.types.ee.riik.xtee.tarn.producers.producer.tarn.TaitmisavalduseEsitamineVastus;
import ee.webmedia.xtee.client.tarn.types.ee.riik.xtee.tarn.producers.producer.tarn.ToiminguTeavitus;

/**
 * <code>PKR</code> or <code>TPKR</code> X-tee service
 * 
 * @author Romet Piho
 */
public interface TarnXTeeService {

  /**
   * <code>tarn.taitemenetluseMuutmineTa.v1</code> service.
   */
  TaitemenetluseMuutmineTaVastus taitemenetluseMuutmine(
      TaitemenetluseMuutmineTaSisend paring)
      throws XTeeServiceConsumptionException;

  /**
   * <code>tarn.taitmisavalduseEsitamine.v1</code> service.
   */
  TaitmisavalduseEsitamineVastus taitmisavalduseEsitamine(TaitmisavalduseEsitamineParing input)
      throws XTeeServiceConsumptionException;
}
