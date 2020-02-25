# Security Analysis

The school's infrastructure will be heavily reliant on the contents of the
database. We do not want an attacker to delete database values. Doing so can
show user accounts as non-existent, classes as untaken, or classes unavailable.
An attacker might also want to edit student accounts to show them erroneously as
completing a class even though they haven't. An attacker might also be able to
drop students from classes without their permission. This application handles
all services regarding registration. This application functions similarly to a
bank's ledger and it should be treated the same way. An attack on the
registration system can diminish the trust in the institution and cause heavy
financial losses. Attacks or exploitations would most likely come from
disgruntled students, and/or staff.
The Spring framework offers tons of different microservices. Among them is the
Spring Security framework. This framework allows the configuration of cookies,
prevents MIME Sniffing, denies X-Frame overlays and click-jacking, SQLi, and XSS by handling the
escaping and filtering. The Spring Framework also encodes user passwords
with the bcrypt hash function (though offers backward compatibility and future
installments). Provides a opinionated way to handle access control by handling
it within the framework and not through your own implementation.

WAPS 10 to prevent:

1: Injection
  - We are using hibernate and if you properly use your HQL queries to
  take input as Strings in the configuration page, SQLi cannot be accomplished.
  This is equivalent to prepared statements.
2: Broken Auth
  - 2 Factor Authentication.
3: Sensitive Data Exposure
  - Encrypt the data at rest. However, most of the data at rest isn't PII or
  highly senstitive at all. But will still encrypt at rest data.
4: XML Externals
  - With the exception of the Spring configuration file, we will not be parsing
  or accepting xml in any form
5: Broken Access control
  - Ensure a multi step process to register an admin. Admin actions will be
  constantly logged and monitored. Mainly to find erroneous/strange behavior.
  But also. Trust but verify.
6: Security Misconfiguration
  - Spring Security denies forbidden access through filters. Start with very
  specific security filters and work the way up to the not so secure filters to
  ensure there is no mistaken fall through
7: XSS
  - Users will not be posting code that will be readable to other students or
  admin. Admin can, and text will need to be sanitized
8: Insecure Deserialization
  - N/A
9: Using Components with unsecure
  - Use up to date security features. For example, we are using bcrypt and not
  most definitely not MD5
10: Insufficient loggin/monitoring
  - Will be logging all data manipulation from the admins.
