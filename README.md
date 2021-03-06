[![Build Status](https://travis-ci.org/stevespringett/dependency-check-sonar-plugin.svg?branch=master)](https://travis-ci.org/stevespringett/dependency-check-sonar-plugin) [ ![Download](https://api.bintray.com/packages/stevespringett/owasp/dependency-check-sonar/images/download.svg) ](https://bintray.com/stevespringett/owasp/dependency-check-sonar/_latestVersion)

Dependency-Check Plugin for SonarQube
=====================================

Integrates [OWASP Dependency-Check] reports into SonarQube v5.1 or higher.

About Dependency-Check
-------------------
Dependency-Check is a utility that attempts to detect publicly disclosed vulnerabilities contained within project dependencies. It does this by determining if there is a Common Platform Enumeration (CPE) identifier for a given dependency. If found, it will generate a report linking to the associated CVE entries.

Dependency-Check supports the identification of project dependencies in a number of different languages including Java, .NET, and Python.

Screenshots
-------------------

![alt tag](screenshots/dashboard-widget.png)

Metrics
-------------------

The plugin keeps track of a number of statistics including:

* Total number of dependencies scanned
* Total number of vulnerabilities found across all dependencies
* Total number of vulnerable components
* Total number of high, medium, and low severity vulnerabilities

Additionally, the following two metrics are defined:

__Inherited Risk Score (IRS)__

(high * 5) + (medium * 3) + (low * 1)

The IRS is simply a weighted measurement of the vulnerabilities inherited by the 
application through the use of vulnerable components. It does not measure the 
applications actual risk due to those components. The higher the score the more 
risk the application inherits.

__Vulnerable Component Ratio__

(vulnerabilities / vulnerableComponents)

This is simply a measurement of the number of vulnerabilities to the vulnerable 
components (as a percentage). A higher percentage indicates that a large number 
of components contain vulnerabilities. Lower percentages are better.


Compiling
-------------------

> $ mvn clean package

Distribution
-------------------
Ready to use binaries are available from [bintray] as well as [GitHub].

Installation
-------------------
Copy the plugin (jar file) to $SONAR_INSTALL_DIR/extensions/plugins and restart SonarQube.

Plugin Configuration
-------------------
Dependency-Check will output a file named 'dependency-check-report.xml' when asked to output XML. The Dependency-Check SonarQube plugin reads an existing Dependency-Check XML report.

A typical SonarQube configuraiton will have the following parameter. This example assumes the use of a Jenkins workspace, but can easily be altered for other CI/CD systems.

```ini
sonar.dependencyCheck.reportPath=${WORKSPACE}/dependency-check-report.xml
```

Ecosystem
-------------------

Dependency-Check is available as a:
* Command-line utility
* Ant Task
* Gradle Plugin
* Jenkins Plugin
* Maven Plugin
* SonarQube Plugin

NOTE: The Sonar plugin does not generate reports, it reads existing reports. Use one of the other available methods to scan project dependencies and generate the necessary XML report.

Copyright & License
-------------------

OWASP Dependency-Check Sonar Plugin is Copyright (c) Steve Springett. All Rights Reserved.

OWASP Dependency-Check is Copyright (c) Jeremy Long. All Rights Reserved.

Permission to modify and redistribute is granted under the terms of the [LGPLv3] license.

  [LGPLv3]: http://www.gnu.org/licenses/lgpl.txt
  [bintray]: https://bintray.com/stevespringett/owasp/dependency-check-sonar/
  [GitHub]: https://github.com/stevespringett/dependency-check-sonar-plugin/releases
  [OWASP Dependency-Check]: https://www.owasp.org/index.php/OWASP_Dependency_Check
