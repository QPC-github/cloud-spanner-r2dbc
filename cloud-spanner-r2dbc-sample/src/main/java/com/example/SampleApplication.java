/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example;

/**
 * An example R2DBC application using the Cloud Spanner R2DBC.
 */
public class SampleApplication {

  private static final String SAMPLE_INSTANCE = "";

  private static final String SAMPLE_DATABASE = "";

  private static final String SAMPLE_PROJECT = "";

  /**
   * Runs through a list of database operations.
   */
  public static void main(String[] args) {

    BookExampleApp bookExampleApp = new BookExampleApp(SAMPLE_INSTANCE, SAMPLE_DATABASE,
        SAMPLE_PROJECT);

    bookExampleApp.dropTableIfPresent();
    bookExampleApp.createTable();
    bookExampleApp.saveBooks();
    bookExampleApp.retrieveBooks();
  }
}
