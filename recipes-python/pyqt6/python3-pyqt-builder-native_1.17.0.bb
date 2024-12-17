SUMMARY = "The PEP 517 compliant PyQt build system"
HOMEPAGE = "https://pypi.org/project/PyQt-builder/"
LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ed1d69a33480ebf4ff8a7a760826d84e"

SRC_URI[sha256sum] = "fce0e92346d2a4296525b7ad9f02b74ea425f26210390ae0d3e4ca08c31cf4cc"

inherit pypi python_setuptools_build_meta native

PYPI_PACKAGE = "pyqt_builder"

DEPENDS += "python3-setuptools-scm-native"
