/*
 * Copyright 2017 The Mifos Initiative.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.mifos.portfolio.service.config;

import io.mifos.core.lang.validation.constraints.ValidIdentifier;
import org.hibernate.validator.constraints.Range;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

/**
 * @author Myrle Krantz
 */
@SuppressWarnings("unused")
@Component
@ConfigurationProperties(prefix="portfolio")
@Validated
public class PortfolioProperties {
  @ValidIdentifier
  private String bookInterestAsUser;

  @Range(min=0, max=23)
  private int bookInterestInTimeSlot = 0;

  public PortfolioProperties() {
  }

  public String getBookInterestAsUser() {
    return bookInterestAsUser;
  }

  public void setBookInterestAsUser(String bookInterestAsUser) {
    this.bookInterestAsUser = bookInterestAsUser;
  }

  public int getBookInterestInTimeSlot() {
    return bookInterestInTimeSlot;
  }

  public void setBookInterestInTimeSlot(int bookInterestInTimeSlot) {
    this.bookInterestInTimeSlot = bookInterestInTimeSlot;
  }
}
