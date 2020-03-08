Public Class Form1
    Private Sub btnShowFlag_Click(sender As Object, e As EventArgs) Handles btnShowFlag.Click
        'State Flags Program
        'Programmer: Nick DeVos
        'Date: 2/2/2018
        Dim strFlagChoice As String

        strFlagChoice = txtStateAbbrev.Text

        Select Case strFlagChoice
            Case "AK"   'Alaska
                picFlag.Load("ak_fi.gif")
                lblYear.Text = 1927
                lblFeatures.Text = "The Alaskan state flag features eight gold stars representing the Big Dipper on a blue background"
            Case "AL"   'Alabama
                picFlag.Load("al_fi.gif")
                lblYear.Text = 1895
                lblFeatures.Text = "Alabama's state flag is a crimson cross over a white background"
            Case "AR"   'Arkansas
                picFlag.Load("ar_fi.gif")
                lblYear.Text = 1924
                lblFeatures.Text = "Arkansas' state flag features the name of the state in a diamond with stars in red, white and blue"
            Case "AZ"   'Arizona
                picFlag.Load("az_fi.gif")
                lblYear.Text = 1917
                lblFeatures.Text = "Arizona's flag has a copper star in the center with 13 rays of red and yellow on the top half with a blue bottom"
            Case "CA"   'California
                picFlag.Load("ca_fi.gif")
                lblYear.Text = 1911
                lblFeatures.Text = "The California state flag has a bear and a red star above the words California Republic"
            Case "CO"   'Colorado
                picFlag.Load("co_fi.gif")
                lblYear.Text = 1911
                lblFeatures.Text = "Colorado's flag features a large red letter 'C' with a gold circle in the middle and blue and white stripped background"
            Case "CT"   'Connecticut
                picFlag.Load("ct_fi.gif")
                lblYear.Text = 1897
                lblFeatures.Text = "Connecticut's flag has a large shield in the center with grape vines and the words 'Qui transtulit sustinet' below"
            Case "DE"   'Delaware
                picFlag.Load("de_fi.gif")
                lblYear.Text = 1913
                lblFeatures.Text = "Delaware's state flag features a diamond, coat of arms, and the date 'December 7, 1787'"
            Case "FL"   'Florida
                picFlag.Load("fl_fi.gif")
                lblYear.Text = 1900
                lblFeatures.Text = "The state flag of Florida has a red 'x' with the Florida state seal on top"
            Case "GA"   'Georgia
                picFlag.Load("ga_fi.gif")
                lblYear.Text = 2003
                lblFeatures.Text = "Georgia's flag has the state seal sounded by a circle of stars and red, white and blue background"
            Case "HI"   'Hawaii
                picFlag.Load("hi_fi.gif")
                lblYear.Text = 1816
                lblFeatures.Text = "Hawaii's state flag has the British Union Jack on the top left corner and eight red, white and blue stripes"
            Case "IA"   'Iowa
                picFlag.Load("ia_fi.gif")
                lblYear.Text = 1921
                lblFeatures.Text = "Iowa's flag has an eagle holding a banner and the name of the state under it with a red, a white and a blue vertical stripe"
            Case "ID"   'Idaho
                picFlag.Load("id_fi.gif")
                lblYear.Text = 1907
                lblFeatures.Text = "Idaho's state flag is the state seal and 'State of Idaho' over a blue background with a gold 3/4 border"
            Case "IL"   'Illinois
                picFlag.Load("il_fi.gif")
                lblYear.Text = 1915
                lblFeatures.Text = "Illinois' flag features an eagle on a rock with the state name below"
            Case "IN"   'Indiana
                picFlag.Load("in_fi.gif")
                lblYear.Text = 1917
                lblFeatures.Text = "Indiana's flag has a golden torch with gold stars surrounding it on a blue background"
            Case "KS"   'Kansas
                picFlag.Load("ks_fi.gif")
                lblYear.Text = 1927
                lblFeatures.Text = "Kansas' flag has their state seal centered on the flag with the state's name below"
            Case "KY"   'Kentucky
                picFlag.Load("ky_fi.gif")
                lblYear.Text = 1918
                lblFeatures.Text = "Kentucky's flag has the state seal in the center with 'Commonwealth of Kentucky' above it"
            Case "LA"   'Louisiana
                picFlag.Load("la_fi.gif")
                lblYear.Text = 1912
                lblFeatures.Text = "Louisiana's flag has a pelican feeding baby pelicans and the state's motto below on a blue background"
            Case "MA"   'Massachusetts
                picFlag.Load("ma_fi.gif")
                lblYear.Text = 1915
                lblFeatures.Text = "Massachusetts' flag has a blue shield centered on a white background"
            Case "MD"   'Maryland
                picFlag.Load("md_fi.gif")
                lblYear.Text = 1904
                lblFeatures.Text = "Maryland's state flag is divided into quarters with the same two patterns shown on each diagonal quarter"
            Case "ME"   'Maine
                picFlag.Load("me_fi.gif")
                lblYear.Text = 1901
                lblFeatures.Text = "Maine's flag is a Maine coat of arms on a blue field"
            Case "MI"   'Michigan
                picFlag.Load("mi_fi.gif")
                lblYear.Text = 1911
                lblFeatures.Text = "Michigan's flag has an elk and a moose supporting a shield between them and an eagle above"
            Case "MN"   'Minnesota
                picFlag.Load("mn_fi.gif")
                lblYear.Text = 1893
                lblFeatures.Text = "Minnesota's flag is the state seal on a blue background with a 3/4 gold border"
            Case "MO"   'Missouri
                picFlag.Load("mo_fi.gif")
                lblYear.Text = 1913
                lblFeatures.Text = "Missouri's flag is the Missouri coat of arms on a background of red, white and blue horizontal stripes"
            Case "MS"   'Mississippi
                picFlag.Load("ms_fi.gif")
                lblYear.Text = 1894
                lblFeatures.Text = "Mississippi's flag has the confederate flag in the top left corner and red, white and blue bars"
            Case "MT"   'Montana
                picFlag.Load("mt_fi.gif")
                lblYear.Text = 1905
                lblFeatures.Text = "Montana's flag consists of the Montana seal on a blue background with the state's name above it"
            Case "NC"   'North Carolina
                picFlag.Load("nc_fi.gif")
                lblYear.Text = 1861
                lblFeatures.Text = "The NC state flag has the letters 'N' and 'C' with a star between them on the left on a vertical blue bar"
            Case "ND"   'North Dakota
                picFlag.Load("nd_fi.gif")
                lblYear.Text = 1911
                lblFeatures.Text = "North Dakota's flag has a bald eagle with 'North Dakota' under it"
            Case "NE"   'Nebraska
                picFlag.Load("ne_fi.gif")
                lblYear.Text = 1963
                lblFeatures.Text = "Nebraska's state flag is simply the state seal on a blue background"
            Case "NH"   'New Hampshire
                picFlag.Load("nh_fi.gif")
                lblYear.Text = 1909
                lblFeatures.Text = "New Hampshire's flag is the state seal on a blue background"
            Case "NJ"   'New Jersey
                picFlag.Load("nj_fi.gif")
                lblYear.Text = 1896
                lblFeatures.Text = "New Jersey's flag consists of the state's coat of arms on a buff colored background"
            Case "NM"   'New Mexico
                picFlag.Load("nm_fi.gif")
                lblYear.Text = 1920
                lblFeatures.Text = "New Mexico's flag has a red Zia on a field of yellow"
            Case "NV"   'Nevada
                picFlag.Load("nv_fi.gif")
                lblYear.Text = 1929
                lblFeatures.Text = "Nevada's flag has a star with 'Battle Born' above it and 'Nevada' below it, all in the top left corner"
            Case "NY"   'New York
                picFlag.Load("ny_fi.gif")
                lblYear.Text = 1778
                lblFeatures.Text = "New York's state flag is their coat of arms on a blue field"
            Case "OH"   'Ohio
                picFlag.Load("oh_fi.gif")
                lblYear.Text = 1902
                lblFeatures.Text = "The main part of Ohio's state flag is a blue triangle with stars and white and red colored circles"
            Case "OK"   'Oklahoma
                picFlag.Load("ok_fi.gif")
                lblYear.Text = 1911
                lblFeatures.Text = "Oklahoma's flag shows an Osage warrior's shield with a peace pipe and olive branch in front"
            Case "OR"   'Oregon
                picFlag.Load("or_fi.gif")
                lblYear.Text = 1925
                lblFeatures.Text = "Oregon's flag has a gold shield with 'State of Oregon' above and '1859' below and a beaver on the back side"
            Case "PA"   'Pennsylvania
                picFlag.Load("pa_fi.gif")
                lblYear.Text = 1799
                lblFeatures.Text = "Pennsylvania's state flag shows the PA coat of arms on a blue field"
            Case "RI"   'Rhode Island
                picFlag.Load("ri_fi.gif")
                lblYear.Text = 1897
                lblFeatures.Text = "Rhode Island's flag has a golden anchor with gold stars around it and the word 'Hope' below on a white background"
            Case "SC"   'South Carolina
                picFlag.Load("sc_fi.gif")
                lblYear.Text = 1765
                lblFeatures.Text = "The SC state flag consists of a cresent and a Palmetto on a blue background"
            Case "SD"   'South Dakota
                picFlag.Load("sd_fi.gif")
                lblYear.Text = 1909
                lblFeatures.Text = "South Dakota's flag has the SD seal in the center with the state name above and 'The Mount Rushmore State' below"
            Case "TN"   'Tennessee
                picFlag.Load("tn_fi.gif")
                lblYear.Text = 1905
                lblFeatures.Text = "Tennessee's flag has a circle in the middle with 3 stars all in red, white and blue"
            Case "TX"   'Texas
                picFlag.Load("tx_fi.gif")
                lblYear.Text = 1836
                lblFeatures.Text = "Texas' state flag has a white star on a vertical blue bar with horizontal red and white bars to the right"
            Case "UT"   'Utah
                picFlag.Load("ut_fi.gif")
                lblYear.Text = 1896
                lblFeatures.Text = "Utah's flag has the state seal on a blue field with a 3/4 gold border"
            Case "VA"   'Virginia
                picFlag.Load("va_fi.gif")
                lblYear.Text = 1861
                lblFeatures.Text = "Virginia's state flag is the VA state seal on a blue background"
            Case "VT"   'Vermont
                picFlag.Load("vt_fi.gif")
                lblYear.Text = 1919
                lblFeatures.Text = "Vermont's state flag is the Vermont state coat of arms on a blue field"
            Case "WA"   'Washington
                picFlag.Load("wa_fi.gif")
                lblYear.Text = 1923
                lblFeatures.Text = "Washington's state flag is the state seal on a green field"
            Case "WI"   'Wisconsin
                picFlag.Load("wi_fi.gif")
                lblYear.Text = 1913
                lblFeatures.Text = "Wisconsin's flag has the state's coat of arms with the name of the state above and '1848' below"
            Case "WV"   'West Virginia
                picFlag.Load("wv_fi.gif")
                lblYear.Text = 1905
                lblFeatures.Text = "West Virginia's flag consists of their coat of arms on a white field with a blue border"
            Case "WY"   'Wyoming
                picFlag.Load("wy_fi.gif")
                lblYear.Text = 1917
                lblFeatures.Text = "Wyoming's state flag has a white buffalo with the state seal on its side on a blue field with white and red borders"
        End Select
    End Sub
End Class
