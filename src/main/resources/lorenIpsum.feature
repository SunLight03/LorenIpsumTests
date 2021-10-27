Feature: Lorem Ipsum tests

  Scenario Outline: Check that default setting result in text starting with Lorem ipsum

    Given User opens '<homePage>' page
    When User generate Loren Ipsum text
    Then User checks that generated text starts with the '<keyword>'
    Examples:
      | homePage            | keyword                                                 |
      | https://lipsum.com/ | Lorem ipsum dolor sit amet, consectetur adipiscing elit |

  Scenario Outline: Check that the word "рыба" correctly appears in the first paragraph

    Given User opens '<homePage>' page
    And User switch to Russian language
    Then User checks that text of the first  element, which is the first paragraph, contains the '<keyword>'
    Examples:
      | homePage            | keyword |
      | https://lipsum.com/ | рыба    |

  Scenario Outline: Check that the checkbox "Start with 'Lorem ipsum" works correctly

    Given User opens '<homePage>' page
    And Uncheck start with Lorem Ipsum checkbox
    And User generate Loren Ipsum text
    Then User checks that generated text result no longer starts with '<keyword>'
    Examples:
      | homePage            | keyword     |
      | https://lipsum.com/ | Lorem ipsum |

  Scenario Outline: Check that Lorem Ipsum is generated with correct size of words:

    Given User opens '<homePage>' page
    And User click on '<type>'
    And Input the '<number>'
    And User generate Loren Ipsum text
    Then User checks that result in words matches the '<expectedNumber>'
    Examples:
      | homePage            | type  | number | expectedNumber |
      | https://lipsum.com/ | words | -1     | 5              |
      | https://lipsum.com/ | words | 0      | 5              |
      | https://lipsum.com/ | words | 5      | 5              |
      | https://lipsum.com/ | words | 10     | 10             |
      | https://lipsum.com/ | words | 20     | 20             |

  Scenario Outline: Check that Lorem Ipsum is generated with correct size of bytes:
    Given User opens '<homePage>' page
    And User click on '<keyword>'
    And Input the '<number>'
    And User generate Loren Ipsum text
    Then User checks that result in bytes matches the '<expectedNumber>'
    Examples:
      | homePage            | keyword | number | expectedNumber |
      | https://lipsum.com/ | bytes   | -1     | 5              |
      | https://lipsum.com/ | bytes   | 0      | 5              |
      | https://lipsum.com/ | bytes   | 2      | 3              |
      | https://lipsum.com/ | bytes   | 3      | 3              |
      | https://lipsum.com/ | bytes   | 5      | 5              |

  Scenario Outline: Check that randomly generated text paragraphs contain the word "lorem" with probability of more than 40%:
    Given User opens '<homePage>' page
    Then User run the generation ten times and check that the average number of paragraphs containing the word “lorem” more then two
    Examples:
      | homePage            |
      | https://lipsum.com/ |