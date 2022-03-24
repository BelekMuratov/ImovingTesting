

@Homework
  Feature: choose My appartment and room type
    Background:
      Given user is on qaa environment

      Scenario: Choose My Appartment and 3 Bedroom
        When user should select My Appartment
        And user should select 3 Bedroom on Move Size
