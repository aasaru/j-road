package com.nortal.jroad.client.koodikeskus;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

import javax.annotation.Resource;

import junit.framework.Assert;

import org.junit.Test;

import com.nortal.jroad.client.exception.XRoadServiceConsumptionException;
import com.nortal.jroad.client.koodikeskus.KoodikeskusXTeeServiceImpl;
import com.nortal.jroad.client.koodikeskus.types.ee.riik.xtee.koodikeskus.producers.producer.koodikeskus.ATCKlassifikaator;
import com.nortal.jroad.client.koodikeskus.types.ee.riik.xtee.koodikeskus.producers.producer.koodikeskus.Haigus;
import com.nortal.jroad.client.koodikeskus.types.ee.riik.xtee.koodikeskus.producers.producer.koodikeskus.Hinnakokkulepe;
import com.nortal.jroad.client.koodikeskus.types.ee.riik.xtee.koodikeskus.producers.producer.koodikeskus.Myygiluba;
import com.nortal.jroad.client.koodikeskus.types.ee.riik.xtee.koodikeskus.producers.producer.koodikeskus.Pakend;
import com.nortal.jroad.client.koodikeskus.types.ee.riik.xtee.koodikeskus.producers.producer.koodikeskus.Piirhind;
import com.nortal.jroad.client.koodikeskus.types.ee.riik.xtee.koodikeskus.producers.producer.koodikeskus.Ravimvorm;
import com.nortal.jroad.client.koodikeskus.types.ee.riik.xtee.koodikeskus.producers.producer.koodikeskus.Soodustus;
import com.nortal.jroad.client.koodikeskus.types.ee.riik.xtee.koodikeskus.producers.producer.koodikeskus.Toimeaine;
import com.nortal.jroad.client.test.BaseXRoadServiceImplTest;

/**
 * @author Aleksei Bogdanov (aleksei.bogdanov@nortal.com)
 */
public class KoodikeskusXTeeServiceImplTest extends BaseXRoadServiceImplTest {

  @Resource
  private KoodikeskusXTeeServiceImpl koodikeskusXTeeServiceImpl;

  @Test
  public void findATCKlassifikaatoridv1() throws XRoadServiceConsumptionException {
    Calendar calendar = Calendar.getInstance();
    calendar.add(Calendar.DAY_OF_MONTH, -10);
    List<String> items = koodikeskusXTeeServiceImpl.findATCKlassifikaatoridv1(calendar.getTime());
    Assert.assertNotNull(items);
  }

  @Test
  public void findATCKlassifikaatoridDetailandmedv1() throws XRoadServiceConsumptionException {
    String ATCKood = "A01AA01";
    List<String> ATCKoodid = new ArrayList<String>();
    ATCKoodid.add(ATCKood);
    List<ATCKlassifikaator> items = koodikeskusXTeeServiceImpl.findATCKlassifikaatoridDetailandmedv1(ATCKoodid);
    Assert.assertNotNull(items);
    Assert.assertTrue(items.size() == 1);
    ATCKlassifikaator klassifikaator = items.get(0);
    Assert.assertTrue(ATCKood.equals(klassifikaator.getKood()));
    Assert.assertEquals("naatriumfluoriid", klassifikaator.getNimiEesti());
  }

  @Test
  public void findHaigusedv1() throws XRoadServiceConsumptionException {
    Calendar calendar = Calendar.getInstance();
    calendar.add(Calendar.DAY_OF_MONTH, -10);
    List<String> items = koodikeskusXTeeServiceImpl.findToimeainedv1(calendar.getTime());
    Assert.assertNotNull(items);
  }

  @Test
  public void findHaigusedDetailandmedv1() throws XRoadServiceConsumptionException {
    String haiguseKood = "3";
    List<String> haiguseKoodid = new ArrayList<String>();
    haiguseKoodid.add(haiguseKood);
    List<Haigus> items = koodikeskusXTeeServiceImpl.findHaigusedDetailandmedv1(haiguseKoodid);
    Assert.assertNotNull(items);
    Assert.assertTrue(items.size() == 1);
    Haigus haigus = items.get(0);
    Assert.assertTrue(haiguseKood.equals(haigus.getKood()));
  }

  @Test
  public void findPakendidv1() throws XRoadServiceConsumptionException {
    Calendar calendar = Calendar.getInstance();
    calendar.add(Calendar.DAY_OF_MONTH, -1);
    List<String> items = koodikeskusXTeeServiceImpl.findPakendidv1(calendar.getTime());
    Assert.assertNotNull(items);
  }

  @Test
  public void findPakendidDetailandmedv1() throws XRoadServiceConsumptionException {
    String pakendiKood = "1026177";
    List<String> pakendiKoodid = new ArrayList<String>();
    pakendiKoodid.add(pakendiKood);
    List<Pakend> items = koodikeskusXTeeServiceImpl.findPakendidDetailandmedv1(pakendiKoodid);
    Assert.assertNotNull(items);
    Assert.assertTrue(items.size() == 1);
    Pakend pakend = items.get(0);
    Assert.assertTrue(pakendiKood.equals(pakend.getKood()));
  }

  @Test
  public void findRavimvormidv1() throws XRoadServiceConsumptionException {
    Calendar calendar = Calendar.getInstance();
    calendar.add(Calendar.DAY_OF_MONTH, -10);
    List<String> items = koodikeskusXTeeServiceImpl.findRavimvormidv1(calendar.getTime());
    Assert.assertNotNull(items);
  }

  @Test
  public void findRavimvormidDetailandmedv1() throws XRoadServiceConsumptionException {
    String ravimvormiKood = "748";
    List<String> ravimvormiKoodid = new ArrayList<String>();
    ravimvormiKoodid.add(ravimvormiKood);
    List<Ravimvorm> items = koodikeskusXTeeServiceImpl.findRavimvormidDetailandmedv1(ravimvormiKoodid);
    Assert.assertNotNull(items);
    Assert.assertTrue(items.size() == 1);
    Ravimvorm ravimvorm = items.get(0);
    Assert.assertTrue(ravimvormiKood.equals(ravimvorm.getId().toString()));
  }

  @Test
  public void findSoodustusedv1() throws XRoadServiceConsumptionException {
    Calendar calendar = Calendar.getInstance();
    calendar.add(Calendar.DAY_OF_MONTH, -10);
    List<String> items = koodikeskusXTeeServiceImpl.findSoodustusedv1(calendar.getTime());
    Assert.assertNotNull(items);
  }

  @Test
  public void findSoodustusedDetailandmedv1() throws XRoadServiceConsumptionException {
    String soodustuseKood = "374435";
    List<String> soodustuseKoodid = new ArrayList<String>();
    soodustuseKoodid.add(soodustuseKood);
    List<Soodustus> items = koodikeskusXTeeServiceImpl.findSoodustusedDetailandmedv1(soodustuseKoodid);
    Assert.assertNotNull(items);
    Assert.assertTrue(items.size() == 1);
    Soodustus soodustus = items.get(0);
    Assert.assertTrue(soodustuseKood.equals(soodustus.getId().toString()));
  }

  @Test
  public void findToimeainedv1() throws XRoadServiceConsumptionException {
    Calendar calendar = Calendar.getInstance();
    calendar.add(Calendar.DAY_OF_MONTH, -10);
    List<String> items = koodikeskusXTeeServiceImpl.findToimeainedv1(calendar.getTime());
    Assert.assertNotNull(items);
  }

  @Test
  public void findToimeainedDetailandmedv1() throws XRoadServiceConsumptionException {
    String toimeaineKood = "8874";
    List<String> toimeaineKoodid = new ArrayList<String>();
    toimeaineKoodid.add(toimeaineKood);
    List<Toimeaine> items = koodikeskusXTeeServiceImpl.findToimeainedDetailandmedv1(toimeaineKoodid);
    Assert.assertNotNull(items);
    Assert.assertTrue(items.size() == 1);
    Toimeaine toimeaine = items.get(0);
    Assert.assertTrue(toimeaineKood.equals(toimeaine.getId().toString()));
  }

  @Test
  public void findPiirhinnadv1() throws XRoadServiceConsumptionException {
    Calendar calendar = Calendar.getInstance();
    calendar.add(Calendar.DAY_OF_MONTH, -12);
    List<String> items = koodikeskusXTeeServiceImpl.findPiirhinnadv1(calendar.getTime());
    Assert.assertNotNull(items);
  }
  
  @Test
  public void findPiirhinnadDetailandmedv1() throws XRoadServiceConsumptionException {
    String piirhinnaKood = "32120";
    List<String> koodid = Collections.singletonList(piirhinnaKood);
    List<Piirhind> items = koodikeskusXTeeServiceImpl.findPiirhinnadDetailandmedv1(koodid);
    Assert.assertNotNull(items);
    Assert.assertTrue(items.size() == 1);
  }
  
  @Test
  public void findHinnakokkuleppedv1() throws XRoadServiceConsumptionException {
    Calendar calendar = Calendar.getInstance();
    calendar.add(Calendar.DAY_OF_MONTH, -12);
    List<String> items = koodikeskusXTeeServiceImpl.findHinnakokkuleppedv1(calendar.getTime());
    Assert.assertNotNull(items);
  }
  
  @Test
  public void findHinnakokkuleppedDetailandmedv1() throws XRoadServiceConsumptionException {
    String kood = "5072";
    List<String> koodid = Collections.singletonList(kood);
    List<Hinnakokkulepe> items = koodikeskusXTeeServiceImpl.findHinnakokkuleppedDetailandmedv1(koodid);
    Assert.assertNotNull(items);
    Assert.assertTrue(items.size() == 1);
  }
  
  @Test
  public void findMyygiloadv1() throws XRoadServiceConsumptionException {
    Calendar calendar = Calendar.getInstance();
    calendar.add(Calendar.DAY_OF_MONTH, -12);
    List<String> items = koodikeskusXTeeServiceImpl.findMyygiloadv1(calendar.getTime());
    Assert.assertNotNull(items);
  }
  
  @Test
  public void findMyygiloadDetailandmedv1() throws XRoadServiceConsumptionException {
    String kood = "697010_24085";
    List<String> koodid = Collections.singletonList(kood);
    List<Myygiluba> items = koodikeskusXTeeServiceImpl.findMyygiloadDetailandmedv1(koodid);
    Assert.assertNotNull(items);
    Assert.assertTrue(items.size() == 1);
  }
}
