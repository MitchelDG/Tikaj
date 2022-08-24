package cz.mkdev.tikajapi.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum UnitType {

  SQUARE_METER("m2"),
  PIECE("ks"),
  GRAM("g"),
  MILLILITER("ml"),
  MINUTE("min"),
  HOUR("hod");

  private final String value;
}
