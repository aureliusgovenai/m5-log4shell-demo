# m5-log4shell-demo

A minimal Maven project used as the target repo for Aurelius's M5
`log4shell-bump` demo recipe.

`pom.xml` deliberately pins `log4j-core` inline at `2.14.1`, a version
affected by [CVE-2021-44228 (log4shell)](https://nvd.nist.gov/vuln/detail/CVE-2021-44228).
The Aurelius `patch-java` runner
([runner-images/patch-java/log4shell-bump.sh](https://github.com/aureliusgovenai/aurelius-platform-sessions-agency-service/blob/main/runner-images/patch-java/log4shell-bump.sh))
clones this repo, bumps that version, runs `mvn test`, and pushes a
branch with the fix — proving the auto-remediation flow end to end
against a real repository instead of a stub.

Do not use this `pom.xml` as a template elsewhere — the outdated
dependency is intentional.
