package org.sonar.dependencycheck.parser.element;

import java.util.Map;

public class License {

	protected final static String UNKNOWN_LICENSE = "<UNKNOWN>";

	public enum KnownLicenses {

		/**
		 * Bouncy Castle Licence: http://www.bouncycastle.org/licence.html
		 * http://www.opensource.org/licenses/eclipse-1.0.php
		 * https://maven.atlassian.com/public/licenses/license.txt
		 * CPL: http://www.opensource.org/licenses/cpl1.0.txt
		 * http://xstream.codehaus.org/license.html
		 */

		AGPL(new String[] { "AGPL-Style License" }),
		AGPL3_0(new String[] { "GNU Affero General Public License v3" }),
		GPL(new String[] { "GPL-Style License" }),
		GPL1_0(new String[] { "GNU General Public License v1.0 only" }),
		GPL2_0(new String[] { "GNU General Public License v2.0 only" }),
		GPL3_0(new String[] { "GNU General Public License v3.0 only", "GNU General Public Library: http://www.gnu.org/licenses/gpl.txt" }),
		OSL(new String[] { "OSL-Style License" }),
		OSL1_0(new String[] { "Open Software License 1.0" }),
		OSL2_0(new String[] { "Open Software License 2.0" }),
		OSL2_1(new String[] { "Open Software License 2.1" }),
		OSL3_0(new String[] { "Open Software License 3.0" }),
		Ruby(new String[] { "Ruby License" }),
		Sleepycat(new String[] { "Sleepycat License" }),
		Adobe(new String[] { "Adobe" }),
		AdobeAFM(new String[] { "Adobe-AFM" }),
		AdobeEULA(new String[] { "Adobe-EULA" }),
		ATT(new String[] { "ATT" }),
		Beerware(new String[] { "Beerware" }),
		Boost(new String[] { "Boost" }),
		DOCBOOK(new String[] { "DOCBOOK" }),
		Dyade(new String[] { "Dyade" }),
		HPDEC(new String[] { "HP-DEC" }),
		IETF(new String[] { "IETF" }),
		IETFstyle(new String[] { "IETF-style" }),
		ImageMagick(new String[] { "ImageMagick" }),
		InfoSeek(new String[] { "InfoSeek" }),
		IPTC(new String[] { "IPTC" }),
		ISO8879(new String[] { "ISO-8879" }),
		JavaMultiCorp(new String[] { "Java-Multi-Corp" }),
		JavaWSDLPolicy(new String[] { "Java-WSDL-Policy" }),
		JavaWSDLSchema(new String[] { "Java-WSDL-Schema" }),
		JPEG(new String[] { "JPEG" }),
		MSIP(new String[] { "MS-IP" }),
		NonStandard(new String[] { "Raw License String Could Not Be Mapped to a Standardized SPDX License" }),
		OSD(new String[] { "OSD" }),
		RedHat(new String[] { "RedHat" }),
		RSASecurity(new String[] { "RSA-Security" }),
		Sun(new String[] { "Sun" }),
		SunBCLA(new String[] { "Sun-BCLA" }),
		SunEULA(new String[] { "Sun-EULA" }),
		SunIP(new String[] { "Sun-IP" }),
		SunNonCommercial(new String[] { "Sun-Non-commercial" }),
		SunRestricted(new String[] { "Sun-Restricted" }),
		SunTM(new String[] { "Sun-TM" }),
		Unicode(new String[] { "Unicode" }),
		Xerox(new String[] { "Xerox" }),
		AFL(new String[] { "AFL-Style License" }),
		AFL1_2(new String[] { "Academic Free License v1.2" }),
		AFL2_0(new String[] { "Academic Free License v2.0" }),
		AFL2_1(new String[] { "Academic Free License v2.1" }),
		AFL3_0(new String[] { "Academic Free License v3.0" }),
		Artistic(new String[] { "AGPL-Style License" }),
		Artistic1_0(new String[] { "Artistic License 1.0" }),
		Artistic2_0(new String[] { "Artistic License 2.0" }),
		CCBY(new String[] { "CC-BY-Style License" }),
		CCBYSA(new String[] { "CC-BY-SA-Style License" }),
		CCBYSA1_0(new String[] { "Creative Commons Attribution Share Alike 1.0" }),
		CCBYSA2_0(new String[] { "Creative Commons Attribution Share Alike 2.0" }),
		CCBYSA2_5(new String[] { "Creative Commons Attribution Share Alike 2.5" }),
		CCBYSA3_0(new String[] { "Creative Commons Attribution Share Alike 3.0" }),
		Apache(new String[] { "Apache-Style License" }),
		Apache1_0(new String[] { "Apache License 1.0" }),
		Apache1_1(new String[] { "Apache License 1.1" }),
		Apache2_0(new String[] { "Apache License 2.0", "Apache 2: http://www.apache.org/licenses/LICENSE-2.0.txt",
				"Apache Software License 2.0: http://www.opensource.org/licenses/apache2.0.php",
				"The Apache Software License, Version 2.0: /LICENSE.txt", "http://www.apache.org/licenses/LICENSE-2.0.txt",
				"The Apache Software License, Version 2.0: http://www.apache.org/licenses/LICENSE-2.0.txt" }),
		BSD(new String[] { "BSD-Style License" }),
		BSD2Clause(new String[] { "BSD 2-clause Simplified or FreeBSD License", "Simplified BSD license: http://xmappr.googlecode.com" }),
		BSD3Clause(new String[] { "BSD 3-clause New or Revised License", "The BSD License: http://www.opensource.org/licenses/bsd-license.php" }),
		BSD4Clause(new String[] { "BSD 4-clause Original or Old License" }),
		CCBY1_0(new String[] { "Creative Commons Attribution 1.0" }),
		CCBY2_0(new String[] { "Creative Commons Attribution 2.0" }),
		CCBY2_5(new String[] { "Creative Commons Attribution 2.5" }),
		CCBY3_0(new String[] { "Creative Commons Attribution 3.0" }),
		CC01_0(new String[] { "Creative Commons Zero v1.0 Universal" }),
		ECL(new String[] { "ECL-Style License" }),
		ECL1_0(new String[] { "Educational Community License v1.0" }),
		ECL2_0(new String[] { "Educational Community License v2.0" }),
		GFDL(new String[] { "GFDL-Style License" }),
		GFDL1_1(new String[] { "GNU Free Documentation License v1.1" }),
		GFDL1_2(new String[] { "GNU Free Documentation License v1.2" }),
		GFDL1_3(new String[] { "GNU Free Documentation License v1.3" }),
		HPND(new String[] { "Historic Permission Notice and Disclaimer" }),
		IPL1_0(new String[] { "IBM Public License v1.0" }),
		ISC(new String[] { "ISC License (Bind, DHCP Server)" }),
		MIT(new String[] { "MIT license (also X11)" }),
		MSPL(new String[] { "Microsoft Public License" }),
		PHP(new String[] { "PHP-Style License" }),
		PHP3_01(new String[] { "PHP License v3_01" }),
		PublicDomain(
				new String[] {
						"The work has been placed in the public domain",
						"Public Domain",
						"Public Domain: http://www.xmlpull.org/v1/download/unpacked/LICENSE.txt",
						"Indiana University Extreme! Lab Software License, vesion 1.1.1: http://www.extreme.indiana.edu/viewcvs/~checkout~/XPP3/java/LICENSE.txt\nPublic Domain: http://creativecommons.org/licenses/publicdomain" }),
		Python(new String[] { "Python-Style License" }),
		Python2_0(new String[] { "Python License 2.0" }),
		SPL1_0(new String[] { "Sun Public License v1.0" }),
		W3C(new String[] { "W3C Software and Notice License" }),
		Zlib(new String[] { "zlib License" }),
		ZPL(new String[] { "ZPL-Style License" }),
		ZPL1_1(new String[] { "Zope Public License 1.1" }),
		ZPL2_0(new String[] { "Zope Public License 2.0" }),
		ZPL2_1(new String[] { "Zope Public License 2.1" }),
		UNKNOWN_LICENCE(new String[] { UNKNOWN_LICENSE });

		private final String[] representations;

		private static Map<String, KnownLicenses> identifier;

		private KnownLicenses(final String[] representations) {
			this.representations = representations;

			updateIdentifier(this);
		}

		protected void updateIdentifier(final KnownLicenses license) {
			for (String id : representations) {
				identifier.put(id, this);
			}
		}

	}

	public boolean isIssue() {
		return true;
	}

	public String getSeverity() {
		return null;
	}

	public String getName() {
		return null;
	}

}
