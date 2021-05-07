package org.example.domain;

import java.util.Comparator;

public class MobileComparator implements Comparator<Mobile> {


  @Override
  public int compare(Mobile o1, Mobile o2) {

      //todo: handle null values

    return Double.compare(o1.getTotalTraveledDistance(), o2.getTotalTraveledDistance());
  }
}
