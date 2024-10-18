SUMMARY = "The PEP 517 compliant PyQt build system"
HOMEPAGE = "https://pypi.org/project/PyQt-builder/"
LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ed1d69a33480ebf4ff8a7a760826d84e"

SRC_URI[sha256sum] = "4515e41ae379be2e54f88a89ecf47cd6e4cac43e862c4abfde18389c2666afdf"

inherit pypi python_setuptools_build_meta native

PYPI_PACKAGE = "pyqt_builder"

DEPENDS += "python3-setuptools-scm-native"
