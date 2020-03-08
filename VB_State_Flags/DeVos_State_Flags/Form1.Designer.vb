<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Form1
    Inherits System.Windows.Forms.Form

    'Form overrides dispose to clean up the component list.
    <System.Diagnostics.DebuggerNonUserCode()> _
    Protected Overrides Sub Dispose(ByVal disposing As Boolean)
        Try
            If disposing AndAlso components IsNot Nothing Then
                components.Dispose()
            End If
        Finally
            MyBase.Dispose(disposing)
        End Try
    End Sub

    'Required by the Windows Form Designer
    Private components As System.ComponentModel.IContainer

    'NOTE: The following procedure is required by the Windows Form Designer
    'It can be modified using the Windows Form Designer.  
    'Do not modify it using the code editor.
    <System.Diagnostics.DebuggerStepThrough()> _
    Private Sub InitializeComponent()
        Me.picFlag = New System.Windows.Forms.PictureBox()
        Me.txtStateAbbrev = New System.Windows.Forms.TextBox()
        Me.btnShowFlag = New System.Windows.Forms.Button()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.lblYearHeader = New System.Windows.Forms.Label()
        Me.lblYear = New System.Windows.Forms.Label()
        Me.lblFeatures = New System.Windows.Forms.Label()
        Me.Label2 = New System.Windows.Forms.Label()
        CType(Me.picFlag, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'picFlag
        '
        Me.picFlag.Location = New System.Drawing.Point(110, 142)
        Me.picFlag.Name = "picFlag"
        Me.picFlag.Size = New System.Drawing.Size(494, 281)
        Me.picFlag.TabIndex = 0
        Me.picFlag.TabStop = False
        '
        'txtStateAbbrev
        '
        Me.txtStateAbbrev.Location = New System.Drawing.Point(207, 30)
        Me.txtStateAbbrev.Name = "txtStateAbbrev"
        Me.txtStateAbbrev.Size = New System.Drawing.Size(49, 20)
        Me.txtStateAbbrev.TabIndex = 1
        '
        'btnShowFlag
        '
        Me.btnShowFlag.Location = New System.Drawing.Point(529, 28)
        Me.btnShowFlag.Name = "btnShowFlag"
        Me.btnShowFlag.Size = New System.Drawing.Size(75, 23)
        Me.btnShowFlag.TabIndex = 2
        Me.btnShowFlag.Text = "Show Flag"
        Me.btnShowFlag.UseVisualStyleBackColor = True
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Location = New System.Drawing.Point(107, 34)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(94, 13)
        Me.Label1.TabIndex = 3
        Me.Label1.Text = "State Abbreviation"
        '
        'lblYearHeader
        '
        Me.lblYearHeader.AutoSize = True
        Me.lblYearHeader.Location = New System.Drawing.Point(107, 64)
        Me.lblYearHeader.Name = "lblYearHeader"
        Me.lblYearHeader.Size = New System.Drawing.Size(75, 13)
        Me.lblYearHeader.TabIndex = 4
        Me.lblYearHeader.Text = "Year Adopted:"
        '
        'lblYear
        '
        Me.lblYear.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle
        Me.lblYear.Location = New System.Drawing.Point(207, 63)
        Me.lblYear.Name = "lblYear"
        Me.lblYear.Size = New System.Drawing.Size(49, 21)
        Me.lblYear.TabIndex = 5
        Me.lblYear.TextAlign = System.Drawing.ContentAlignment.MiddleCenter
        '
        'lblFeatures
        '
        Me.lblFeatures.Location = New System.Drawing.Point(110, 97)
        Me.lblFeatures.Name = "lblFeatures"
        Me.lblFeatures.Size = New System.Drawing.Size(612, 23)
        Me.lblFeatures.TabIndex = 6
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Location = New System.Drawing.Point(262, 38)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(69, 13)
        Me.Label2.TabIndex = 7
        Me.Label2.Text = "ex. NC, GA..."
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(734, 461)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.lblFeatures)
        Me.Controls.Add(Me.lblYear)
        Me.Controls.Add(Me.lblYearHeader)
        Me.Controls.Add(Me.Label1)
        Me.Controls.Add(Me.btnShowFlag)
        Me.Controls.Add(Me.txtStateAbbrev)
        Me.Controls.Add(Me.picFlag)
        Me.Name = "Form1"
        Me.Text = "State Flags"
        CType(Me.picFlag, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents picFlag As PictureBox
    Friend WithEvents txtStateAbbrev As TextBox
    Friend WithEvents btnShowFlag As Button
    Friend WithEvents Label1 As Label
    Friend WithEvents lblYearHeader As Label
    Friend WithEvents lblYear As Label
    Friend WithEvents lblFeatures As Label
    Friend WithEvents Label2 As Label
End Class
