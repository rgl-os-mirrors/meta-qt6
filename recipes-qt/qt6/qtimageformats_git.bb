LICENSE = "The-Qt-Company-Commercial | GPL-3.0-only & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-only) & GFDL-1.3-no-invariants-only"
LIC_FILES_CHKSUM = " \
    file://LICENSES/GFDL-1.3-no-invariants-only.txt;md5=a22d0be1ce2284b67950a4d1673dd1b0 \
    file://LICENSES/GPL-2.0-only.txt;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://LICENSES/GPL-3.0-only.txt;md5=d32239bcb673463ab874e80d47fae504 \
    file://LICENSES/LGPL-3.0-only.txt;md5=e6a600fd5e1d9cbde2d983680233ad02 \
    file://LICENSES/LicenseRef-Qt-Commercial.txt;md5=40a1036f91cefc0e3fabad241fb5f187 \
"

inherit qt6-cmake

include recipes-qt/qt6/qt6-git.inc
include recipes-qt/qt6/qt6.inc

DEPENDS += "qtbase"

PACKAGECONFIG ?= "tiff webp"
PACKAGECONFIG[jasper] = "-DFEATURE_jasper=ON,-DFEATURE_jasper=OFF,jasper"
PACKAGECONFIG[mng] = "-DFEATURE_mng=ON,-DFEATURE_mng=OFF,libmng"
PACKAGECONFIG[tiff] = "-DFEATURE_tiff=ON,-DFEATURE_libtiff=OFF,tiff"
PACKAGECONFIG[webp] = "-DFEATURE_webp=ON,-DFEATURE_webp=OFF,libwebp"

