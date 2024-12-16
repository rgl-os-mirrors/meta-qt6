SUMMARY = "The sip module support for PyQt6"
HOMEPAGE = "https://pypi.org/project/PyQt6-sip/"
LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ed1d69a33480ebf4ff8a7a760826d84e"

SRC_URI[sha256sum] = "15be741d1ae8c82bb7afe9a61f3cf8c50457f7d61229a1c39c24cd6e8f4d86dc"

inherit pypi setuptools3

PYPI_PACKAGE = "pyqt6_sip"

BBCLASSEXTEND = "native nativesdk"
