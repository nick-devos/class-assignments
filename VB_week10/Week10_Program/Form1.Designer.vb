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
        Me.components = New System.ComponentModel.Container()
        Me.gbSelection = New System.Windows.Forms.GroupBox()
        Me.radSteel = New System.Windows.Forms.RadioButton()
        Me.radWater = New System.Windows.Forms.RadioButton()
        Me.radAir = New System.Windows.Forms.RadioButton()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.txtDistance = New System.Windows.Forms.TextBox()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.lblSpeedOfSound = New System.Windows.Forms.Label()
        Me.btnCalculate = New System.Windows.Forms.Button()
        Me.ErrorProvider1 = New System.Windows.Forms.ErrorProvider(Me.components)
        Me.gbSelection.SuspendLayout()
        CType(Me.ErrorProvider1, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'gbSelection
        '
        Me.gbSelection.Controls.Add(Me.radSteel)
        Me.gbSelection.Controls.Add(Me.radWater)
        Me.gbSelection.Controls.Add(Me.radAir)
        Me.gbSelection.Location = New System.Drawing.Point(25, 39)
        Me.gbSelection.Name = "gbSelection"
        Me.gbSelection.Size = New System.Drawing.Size(191, 156)
        Me.gbSelection.TabIndex = 0
        Me.gbSelection.TabStop = False
        Me.gbSelection.Text = "Selected Medium"
        '
        'radSteel
        '
        Me.radSteel.AutoSize = True
        Me.radSteel.Location = New System.Drawing.Point(26, 107)
        Me.radSteel.Name = "radSteel"
        Me.radSteel.Size = New System.Drawing.Size(49, 17)
        Me.radSteel.TabIndex = 2
        Me.radSteel.TabStop = True
        Me.radSteel.Text = "Steel"
        Me.radSteel.UseVisualStyleBackColor = True
        '
        'radWater
        '
        Me.radWater.AutoSize = True
        Me.radWater.Location = New System.Drawing.Point(26, 71)
        Me.radWater.Name = "radWater"
        Me.radWater.Size = New System.Drawing.Size(54, 17)
        Me.radWater.TabIndex = 1
        Me.radWater.TabStop = True
        Me.radWater.Text = "Water"
        Me.radWater.UseVisualStyleBackColor = True
        '
        'radAir
        '
        Me.radAir.AutoSize = True
        Me.radAir.Location = New System.Drawing.Point(26, 33)
        Me.radAir.Name = "radAir"
        Me.radAir.Size = New System.Drawing.Size(37, 17)
        Me.radAir.TabIndex = 0
        Me.radAir.TabStop = True
        Me.radAir.Text = "Air"
        Me.radAir.UseVisualStyleBackColor = True
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Location = New System.Drawing.Point(286, 39)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(109, 13)
        Me.Label1.TabIndex = 1
        Me.Label1.Text = "Distance Traveled (ft)"
        '
        'txtDistance
        '
        Me.txtDistance.Location = New System.Drawing.Point(289, 55)
        Me.txtDistance.Name = "txtDistance"
        Me.txtDistance.Size = New System.Drawing.Size(106, 20)
        Me.txtDistance.TabIndex = 2
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Font = New System.Drawing.Font("Microsoft Sans Serif", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label2.Location = New System.Drawing.Point(47, 248)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(125, 20)
        Me.Label2.TabIndex = 3
        Me.Label2.Text = "Speed of Sound"
        '
        'lblSpeedOfSound
        '
        Me.lblSpeedOfSound.BackColor = System.Drawing.SystemColors.Info
        Me.lblSpeedOfSound.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D
        Me.lblSpeedOfSound.Font = New System.Drawing.Font("Microsoft Sans Serif", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblSpeedOfSound.Location = New System.Drawing.Point(178, 247)
        Me.lblSpeedOfSound.Name = "lblSpeedOfSound"
        Me.lblSpeedOfSound.Size = New System.Drawing.Size(217, 23)
        Me.lblSpeedOfSound.TabIndex = 4
        '
        'btnCalculate
        '
        Me.btnCalculate.Location = New System.Drawing.Point(289, 104)
        Me.btnCalculate.Name = "btnCalculate"
        Me.btnCalculate.Size = New System.Drawing.Size(106, 23)
        Me.btnCalculate.TabIndex = 5
        Me.btnCalculate.Text = "&Calculate"
        Me.btnCalculate.UseVisualStyleBackColor = True
        '
        'ErrorProvider1
        '
        Me.ErrorProvider1.ContainerControl = Me
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(464, 321)
        Me.Controls.Add(Me.btnCalculate)
        Me.Controls.Add(Me.lblSpeedOfSound)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.txtDistance)
        Me.Controls.Add(Me.Label1)
        Me.Controls.Add(Me.gbSelection)
        Me.Name = "Form1"
        Me.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen
        Me.Text = "Speed Of Sound"
        Me.gbSelection.ResumeLayout(False)
        Me.gbSelection.PerformLayout()
        CType(Me.ErrorProvider1, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents gbSelection As GroupBox
    Friend WithEvents radSteel As RadioButton
    Friend WithEvents radWater As RadioButton
    Friend WithEvents radAir As RadioButton
    Friend WithEvents Label1 As Label
    Friend WithEvents txtDistance As TextBox
    Friend WithEvents Label2 As Label
    Friend WithEvents lblSpeedOfSound As Label
    Friend WithEvents btnCalculate As Button
    Friend WithEvents ErrorProvider1 As ErrorProvider
End Class
