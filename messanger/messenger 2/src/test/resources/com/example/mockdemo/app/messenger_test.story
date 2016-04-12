Given a messenger


When set arguments to viki.com and dramyyyyyy
Then result should return 1


When set arguments to polish.pl and Oo
Then result should return 2


When set arguments to viki.com and Oo
Then result should return 2


When set arguments to polish.pl and abnormalActivity
Then result should either return 0 or 1

When set arguments to viki.com
Then sending should return 1
