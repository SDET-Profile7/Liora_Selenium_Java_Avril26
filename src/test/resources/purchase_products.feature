Feature: Buying Poduct


  As a user, i want to connect to Shopin website and to buy an existing product


  @Jira_123
  Scenario Outline: purchase product for a user


    Given User is on website page

    When User goes to page '<page>'

    And User goes to sub page '<sub_page>'

    And User chooses a product '<product_name>' and adds it to cart


    Examples:
      | page         | sub_page            | product_name      |
      |  Boutique    |  Chaussure          |  Air Jordan 1 Low |
      |  Boutique    |  Accessories        |  Casquette de running |

