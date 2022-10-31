import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://apptest.claimq.id/prweb/tHGV_g6FQZMSYakWUervaQ%28%28*/!STANDARD')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Page_Pega Platform/input_User name_UserIdentifier'), 'testingsurveyor@asm2')

WebUI.setText(findTestObject('Object Repository/Page_Pega Platform/input_Password_Password'), '123456')

WebUI.click(findTestObject('Object Repository/Page_Pega Platform/button_Log in'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Case Worker/button_Formulir Klaim'))

WebUI.delay(5)

WebUI.switchToWindowTitle('Formulir Claim FRM-9702')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_Formulir Claim FRM-9692/img_Tanggal Lapor_CalendarImg-0079ae87'))

WebUI.click(findTestObject('Object Repository/Page_Formulir Claim FRM-9692/button_Submit  Cetak Formulir Klaim_spin-bu_7c04b7'))

WebUI.click(findTestObject('Object Repository/Page_Formulir Claim FRM-9692/button_Submit  Cetak Formulir Klaim_spin-bu_7c04b7'))

WebUI.click(findTestObject('Object Repository/Page_Formulir Claim FRM-9692/button_Submit  Cetak Formulir Klaim_spin-bu_7c04b7'))

WebUI.click(findTestObject('Object Repository/Page_Formulir Claim FRM-9692/button_Submit  Cetak Formulir Klaim_spin-bu_7c04b7'))

WebUI.click(findTestObject('Object Repository/Page_Formulir Claim FRM-9692/button_Submit  Cetak Formulir Klaim_spin-bu_7c04b7'))

WebUI.click(findTestObject('Object Repository/Page_Formulir Claim FRM-9692/a_31'))

WebUI.click(findTestObject('Object Repository/Page_Formulir Claim FRM-9692/img_Tanggal Kejadian_CalendarImg-0509d02b'))

WebUI.click(findTestObject('Object Repository/Page_Formulir Claim FRM-9692/button_Submit  Cetak Formulir Klaim_spin-bu_7c04b7'))

WebUI.click(findTestObject('Object Repository/Page_Formulir Claim FRM-9692/button_Submit  Cetak Formulir Klaim_spin-bu_7c04b7'))

WebUI.click(findTestObject('Object Repository/Page_Formulir Claim FRM-9692/button_Submit  Cetak Formulir Klaim_spin-bu_7c04b7'))

WebUI.click(findTestObject('Object Repository/Page_Formulir Claim FRM-9692/button_Submit  Cetak Formulir Klaim_spin-bu_7c04b7'))

WebUI.click(findTestObject('Object Repository/Page_Formulir Claim FRM-9692/button_Submit  Cetak Formulir Klaim_spin-bu_7c04b7'))

WebUI.click(findTestObject('Object Repository/Page_Formulir Claim FRM-9692/a_25'))

WebUI.setText(findTestObject('Object Repository/Page_Formulir Claim FRM-9692/input_Required_PWorkFormpPolisNo'), '12100000241293')

WebUI.click(findTestObject('Object Repository/Page_Formulir Claim FRM-9692/button_Ambil Data Polis'))

WebUI.click(findTestObject('Object Repository/Page_Formulir Claim FRM-9692/button_Simpan'))

WebUI.setText(findTestObject('Object Repository/Page_Formulir Claim FRM-9692/input_No Plat Kendaraan_PWorkFormpPolisNoPlat'), 
    'B1310TTN')

WebUI.setText(findTestObject('Object Repository/Page_Formulir Claim FRM-9692/input_No Mesin_PWorkFormpPolisNoMesin'), 'K148T1088075TTN')

WebUI.setText(findTestObject('Object Repository/Page_Formulir Claim FRM-9692/input_No Rangka_PWorkFormpPolisNoRangka'), 
    'MHYKZE81SDJ228149TTN')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Formulir Claim FRM-9692/select_-Pilih Salah Satu-Kerusakan Sebagian_d89ffd'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Formulir Claim FRM-9692/select_-Pilih Salah Satu-Own Damage (OD)TJH'), 
    'OD', true)

WebUI.click(findTestObject('Object Repository/Page_Formulir Claim FRM-9692/label_Ya'))

WebUI.setText(findTestObject('Object Repository/Page_Formulir Claim FRM-9692/input_Wilayah Klaim_PWorkFormpWilayahKlaim'), 
    'TESTING ASM')

WebUI.click(findTestObject('Object Repository/Page_Formulir Claim FRM-9692/span_TESTING ASM'))

WebUI.setText(findTestObject('Object Repository/Page_Formulir Claim FRM-9692/input_Surveyor_PpyWorkPagepIdSurveyor'), 'TESTINGSURVE')

WebUI.click(findTestObject('Object Repository/Page_Formulir Claim FRM-9692/span_TESTINGSURVEYORASM2'))

WebUI.click(findTestObject('Object Repository/Page_Formulir Claim FRM-9692/button_Submit  Cetak Formulir Klaim'))

WebUI.click(findTestObject('Object Repository/Page_Formulir Claim FRM-9692/button_Upload'))

WebUI.uploadFile(findTestObject('Object Repository/Page_Formulir/UploadForm'), 'G:\\QA\\Gambar\\FORMUPLOAD.jpg')

WebUI.click(findTestObject('Object Repository/Page_Formulir Claim FRM-9692/button_Submit'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Formulir Claim FRM-9692/select_Pilih StatusRegister KlaimBatal Klai_f1b285'), 
    'Register Klaim', true)

WebUI.click(findTestObject('Object Repository/Page_Formulir Claim FRM-9692/button_Simpan_1'))

WebUI.click(findTestObject('Object Repository/Page_Formulir Claim FRM-9697/button_Lanjut'))

WebUI.click(findTestObject('Object Repository/Page_Formulir Claim FRM-9697/button_Upload All Document'))

WebUI.uploadFile(findTestObject('Object Repository/Page_Formulir/UploadForm'), 'G:\\QA\\Gambar\\KTP.jpg')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Formulir Claim FRM-9697/select_Pilih DokumenKTPSTNK'), 
    '2209120021473155', true)

WebUI.uploadFile(findTestObject('Object Repository/Page_Formulir/UploadForm'), 'G:\\QA\\Gambar\\STNK.jpg')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Formulir Claim FRM-9697/select_Pilih DokumenKTPSTNK_1'), 
    '2209120021473157', true)

WebUI.click(findTestObject('Object Repository/Page_Formulir Claim FRM-9697/button_Submit'))

WebUI.click(findTestObject('Object Repository/Page_Formulir Claim FRM-9697/button_Simpan'))

WebUI.click(findTestObject('Object Repository/Page_Formulir Claim FRM-9700/button_Unggah'))

WebUI.uploadFile(findTestObject('Page_Formulir/UploadForm'), 'G:\\QA\\Gambar\\Belakang.jpg')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Formulir Claim FRM-9700/select_--- Pilih Sisi Foto ---Tampak DepanT_1a682b'), 
    'Tampak Belakang', true)

WebUI.uploadFile(findTestObject('Page_Formulir/UploadForm'), 'G:\\QA\\Gambar\\Depan.jpg')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Formulir Claim FRM-9700/select_--- Pilih Sisi Foto ---Tampak DepanT_1a682b_1'), 
    'Tampak Depan', true)

WebUI.click(findTestObject('Object Repository/Page_Formulir Claim FRM-9700/button_Submit'))

WebUI.click(findTestObject('Object Repository/Page_Formulir Claim FRM-9700/button_Simpan'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://apptest.claimq.id/prweb/tHGV_g6FQZMSYakWUervaQ%28%28*/!STANDARD')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Page_Pega Platform/input_User name_UserIdentifier'), 'testingsurveyor@asm2')

WebUI.setText(findTestObject('Object Repository/Page_Pega Platform/input_Password_Password'), '123456')

WebUI.click(findTestObject('Object Repository/Page_Pega Platform/button_Log in'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Case Worker/button_Formulir Klaim'))

WebUI.delay(5)

WebUI.switchToWindowTitle('Formulir Claim FRM-9703')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_Formulir Claim FRM-9692/img_Tanggal Lapor_CalendarImg-0079ae87'))

WebUI.click(findTestObject('Object Repository/Page_Formulir Claim FRM-9692/button_Submit  Cetak Formulir Klaim_spin-bu_7c04b7'))

WebUI.click(findTestObject('Object Repository/Page_Formulir Claim FRM-9692/button_Submit  Cetak Formulir Klaim_spin-bu_7c04b7'))

WebUI.click(findTestObject('Object Repository/Page_Formulir Claim FRM-9692/button_Submit  Cetak Formulir Klaim_spin-bu_7c04b7'))

WebUI.click(findTestObject('Object Repository/Page_Formulir Claim FRM-9692/button_Submit  Cetak Formulir Klaim_spin-bu_7c04b7'))

WebUI.click(findTestObject('Object Repository/Page_Formulir Claim FRM-9692/button_Submit  Cetak Formulir Klaim_spin-bu_7c04b7'))

WebUI.click(findTestObject('Object Repository/Page_Formulir Claim FRM-9692/a_31'))

WebUI.click(findTestObject('Object Repository/Page_Formulir Claim FRM-9692/img_Tanggal Kejadian_CalendarImg-0509d02b'))

WebUI.click(findTestObject('Object Repository/Page_Formulir Claim FRM-9692/button_Submit  Cetak Formulir Klaim_spin-bu_7c04b7'))

WebUI.click(findTestObject('Object Repository/Page_Formulir Claim FRM-9692/button_Submit  Cetak Formulir Klaim_spin-bu_7c04b7'))

WebUI.click(findTestObject('Object Repository/Page_Formulir Claim FRM-9692/button_Submit  Cetak Formulir Klaim_spin-bu_7c04b7'))

WebUI.click(findTestObject('Object Repository/Page_Formulir Claim FRM-9692/button_Submit  Cetak Formulir Klaim_spin-bu_7c04b7'))

WebUI.click(findTestObject('Object Repository/Page_Formulir Claim FRM-9692/button_Submit  Cetak Formulir Klaim_spin-bu_7c04b7'))

WebUI.click(findTestObject('Object Repository/Page_Formulir Claim FRM-9692/a_25'))

WebUI.setText(findTestObject('Object Repository/Page_Formulir Claim FRM-9692/input_Required_PWorkFormpPolisNo'), '12100000241293')

WebUI.click(findTestObject('Object Repository/Page_Formulir Claim FRM-9692/button_Ambil Data Polis'))

WebUI.click(findTestObject('Object Repository/Page_Formulir Claim FRM-9692/button_Simpan'))

WebUI.setText(findTestObject('Object Repository/Page_Formulir Claim FRM-9692/input_No Plat Kendaraan_PWorkFormpPolisNoPlat'), 
    'B1310TTN')

WebUI.setText(findTestObject('Object Repository/Page_Formulir Claim FRM-9692/input_No Mesin_PWorkFormpPolisNoMesin'), 'K148T1088075TTN')

WebUI.setText(findTestObject('Object Repository/Page_Formulir Claim FRM-9692/input_No Rangka_PWorkFormpPolisNoRangka'), 
    'MHYKZE81SDJ228149TTN')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Formulir Claim FRM-9692/select_-Pilih Salah Satu-Kerusakan Sebagian_d89ffd'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Formulir Claim FRM-9692/select_-Pilih Salah Satu-Own Damage (OD)TJH'), 
    'OD', true)

WebUI.click(findTestObject('Object Repository/Page_Formulir Claim FRM-9692/label_Ya'))

WebUI.setText(findTestObject('Object Repository/Page_Formulir Claim FRM-9692/input_Wilayah Klaim_PWorkFormpWilayahKlaim'), 
    'TESTING ASM')

WebUI.click(findTestObject('Object Repository/Page_Formulir Claim FRM-9692/span_TESTING ASM'))

WebUI.setText(findTestObject('Object Repository/Page_Formulir Claim FRM-9692/input_Surveyor_PpyWorkPagepIdSurveyor'), 'TESTINGSURVE')

WebUI.click(findTestObject('Object Repository/Page_Formulir Claim FRM-9692/span_TESTINGSURVEYORASM2'))

WebUI.click(findTestObject('Object Repository/Page_Formulir Claim FRM-9692/button_Submit  Cetak Formulir Klaim'))

WebUI.click(findTestObject('Object Repository/Page_Formulir Claim FRM-9692/button_Upload'))

WebUI.uploadFile(findTestObject('Object Repository/Page_Formulir/UploadForm'), 'G:\\QA\\Gambar\\FORMUPLOAD.jpg')

WebUI.click(findTestObject('Object Repository/Page_Formulir Claim FRM-9692/button_Submit'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Formulir Claim FRM-9692/select_Pilih StatusRegister KlaimBatal Klai_f1b285'), 
    'Register Klaim', true)

WebUI.click(findTestObject('Object Repository/Page_Formulir Claim FRM-9692/button_Simpan_1'))

WebUI.click(findTestObject('Object Repository/Page_Formulir Claim FRM-9697/button_Lanjut'))

WebUI.click(findTestObject('Object Repository/Page_Formulir Claim FRM-9697/button_Upload All Document'))

WebUI.uploadFile(findTestObject('Object Repository/Page_Formulir/UploadForm'), 'G:\\QA\\Gambar\\KTP.jpg')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Formulir Claim FRM-9697/select_Pilih DokumenKTPSTNK'), 
    '2209120021473155', true)

WebUI.uploadFile(findTestObject('Object Repository/Page_Formulir/UploadForm'), 'G:\\QA\\Gambar\\STNK.jpg')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Formulir Claim FRM-9697/select_Pilih DokumenKTPSTNK_1'), 
    '2209120021473157', true)

WebUI.click(findTestObject('Object Repository/Page_Formulir Claim FRM-9697/button_Submit'))

WebUI.click(findTestObject('Object Repository/Page_Formulir Claim FRM-9697/button_Simpan'))

WebUI.click(findTestObject('Object Repository/Page_Formulir Claim FRM-9700/button_Unggah'))

WebUI.uploadFile(findTestObject('Object Repository/Page_Formulir/UploadForm'), 'G:\\QA\\Gambar\\Belakang.jpg')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Formulir Claim FRM-9700/select_--- Pilih Sisi Foto ---Tampak DepanT_1a682b'), 
    'Tampak Belakang', true)

WebUI.uploadFile(findTestObject('Object Repository/Page_Formulir/UploadForm'), 'G:\\QA\\Gambar\\Depan.jpg')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Formulir Claim FRM-9700/select_--- Pilih Sisi Foto ---Tampak DepanT_1a682b_1'), 
    'Tampak Depan', true)

WebUI.click(findTestObject('Object Repository/Page_Formulir Claim FRM-9700/button_Submit'))

WebUI.click(findTestObject('Object Repository/Page_Formulir Claim FRM-9700/button_Simpan'))

WebUI.click(findTestObject('Object Repository/Page_Formulir Claim FRM-9703/button_Submit'))

WebUI.navigateToUrl('https://apptest.claimq.id/prweb/hYbtfX1gnQLb4rCVZ6dGog%28%28*/!STANDARD?pyActivity=FinishAssignment&pzFromFrame=pyWorkPage&pzPrimaryPageName=pyWorkPage&pzTransactionId=d54fbf281461392bec43d37703cb96b3&pzHarnessID=HID10880F94AB52BFDD8FC1A1C67E687773')

